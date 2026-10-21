class Solution {
    public int maxProfit(int[] prices) {
        int diff = 0 ;
        int st = prices[0];
        for(int i = 1  ; i < prices.length ; i++){
            if(st > prices[i] ){
                st = prices[i];
            }
            if(st < prices[i]){
                diff = Math.max(diff , prices[i] - st);
            }
        }

        return diff;
    }
}