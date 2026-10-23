class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() -1;

        while(i >= 0 && s.charAt(i) == ' '){
            i--;
        }

        for(int j = i; j >= 0 ; j--){
            char ch = s.charAt(j);
            if(ch == ' '){
                return i - j ;
            }
        }

        return i+1;
    }
}