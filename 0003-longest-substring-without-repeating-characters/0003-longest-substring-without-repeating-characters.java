class Solution {
    public int lengthOfLongestSubstring(String s) {
       int res = 0;

        HashSet<Character> set = new HashSet<>();
        StringBuilder str = new StringBuilder("");
        int l = 0;

        for(char ch : s.toCharArray()){
            while(set.contains(ch)){
                str.deleteCharAt(0);
                set.remove(s.charAt(l));
                l++;
            }

            str.append(ch);
            set.add(ch);

            res = Math.max(res , str.length());
        }

        return res;
    }
}