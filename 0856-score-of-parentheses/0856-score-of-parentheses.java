class Solution {
    public int scoreOfParentheses(String s) {
         int count = 0;
         int score = 0;
         int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < s.length() ; i++){
            if (s.charAt(i) == '('){
                count ++;
            }else if(s.charAt(i)== ')'){
                count --;
                if(s.charAt(i-1) == '('){
                    score += Math.pow(2,count);
                }
            }
        }
        return score;
    }
}