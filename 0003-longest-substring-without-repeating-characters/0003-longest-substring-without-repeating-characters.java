class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;

        int l = 0;
        HashSet<Character> set = new HashSet<>();
        for(char ch : s.toCharArray()){
            while(set.contains(ch)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(ch);

            max = Math.max(max,set.size());
        }

        return max;
    }
}