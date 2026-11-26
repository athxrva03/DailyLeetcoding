class Solution {
    public int numberOfSubstrings(String s) {
        int a = -1;
        int b = -1;
        int c = -1;

        int count = 0;
        for(int i = 0 ;i < s.length() ; i++){
            char ch = s.charAt(i);

            if(ch == 'a'){
                a = i;
            }else if(ch == 'b'){
                b = i;
            }else if(ch == 'c'){
                c = i;
            }

            int min = Math.min(a,Math.min(b,c));

            if(min != -1){
                count += min + 1;
            }
        }

        return count;
    }
}