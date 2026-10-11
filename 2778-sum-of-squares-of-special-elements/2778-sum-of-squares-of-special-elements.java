class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        double res = 0;
        for(int i = 0; i < n ; i++){
            int j = i + 1;
            if(n % j == 0){
                res = res + (nums[i] * nums[i]);
            }
        }

        return  (int) res;
    }
}