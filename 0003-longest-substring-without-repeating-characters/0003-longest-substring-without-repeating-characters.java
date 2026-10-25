class Solution {
    public int lengthOfLongestSubstring(String s) {
       int res = 0;

        HashSet<Character> set = new HashSet<>();
        int l = 0;

        for(char ch : s.toCharArray()){
            while(set.contains(ch)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(ch);

            res = Math.max(res , set.size());
        }

        return res;
    }
}