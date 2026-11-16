class Solution {
    public String digitSum(String s, int k) {

        while(s.length() > k){
            String st = "";
            String str = "";
            for(int i = 0 ;  i < s.length() ; i++){
                str = str + s.charAt(i);

                if(str.length() == k || i == s.length() -1){
                    int sum = 0;

                    for(int p = 0; p < str.length() ; p++){
                        sum += str.charAt(p) - '0';
                    }

                    st = st + Integer.toString(sum);
                    str = "";
                }
            }
            s = st;
        }
        return s;
    }
}