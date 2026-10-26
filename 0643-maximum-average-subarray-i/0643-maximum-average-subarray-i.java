class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int n = nums.length;
        double mSum  = 0;
        double sum = 0;
        for(int i = 0 ; i < k ; i++){
            sum += nums[i];
        }
        mSum = sum / k;

        for(int i = k ; i < n ; i++){
            sum += nums[i];
            sum -= nums[i-k];

            mSum = Math.max(sum/k , mSum);
        }
        return mSum;
    }
}