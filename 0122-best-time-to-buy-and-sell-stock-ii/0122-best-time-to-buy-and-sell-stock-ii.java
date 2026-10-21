class Solution {
    public int maxProfit(int[] prices) {
        int st = prices[0];
        int sum = 0;
        for(int i : prices){
            if(st > i){
                st = i;
            }

            if(st < i){
                sum += i - st;
                st = i;
            }
        }

        return sum;
    }
}