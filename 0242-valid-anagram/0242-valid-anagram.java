class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character,Integer> str = new HashMap<>();
        for(char ch : s.toCharArray()){
            str.put(ch , str.getOrDefault(ch,0) + 1);
        }

        for(char ch : t.toCharArray()){
            str.put(ch , str.getOrDefault(ch,0) - 1);
        }

        for (char ch : str.keySet()) {
            if (!str.get(ch).equals(0)) {
                return false;
            }
        }

        return true;
    }
}