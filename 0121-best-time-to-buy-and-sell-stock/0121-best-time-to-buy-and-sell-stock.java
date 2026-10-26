class Solution {
    public int maxProfit(int[] prices) {
        int st = prices[0];
        int max = 0 ;
        for(int i : prices){
            if(st > i){
                st = i;
            }
            max = Math.max(max , i - st);
        }
        return max;
    }
}