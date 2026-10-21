class Solution {
    public int maxProfit(int[] prices) {
       int st = prices[0];
        int diff = 0;
       for(int i : prices){
            if(st < i){
                diff = Math.max(diff , i - st);
            }
            if(st > i ){
                st = i;
            }
       }

       return diff;
    }
}