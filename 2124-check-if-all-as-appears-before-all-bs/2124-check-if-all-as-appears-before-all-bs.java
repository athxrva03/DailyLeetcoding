class Solution {
    public boolean checkString(String s) {
        int[] freq = new int[2];

        for(char ch : s.toCharArray()){
            if(freq[1] > 0){
                if(ch == 'a'){
                    return false;
                }
            }
            freq[ch-'a']++;
        }

        return true;
    }
}