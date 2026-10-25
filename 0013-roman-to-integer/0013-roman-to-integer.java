class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int l = s.length();
        for(int i = 0 ; i < l; i++){
            char fChar = s.charAt(i);
            int curr = value(fChar);

            if((i + 1) < l && value(s.charAt(i+1)) > curr){
                sum -= curr;
            }
            else{
                sum += curr;
            }
        }

        return sum ;
    }

    private int value(char ch){
        switch (ch) {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }
}