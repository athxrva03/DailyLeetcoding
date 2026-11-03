class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i : nums){
            sum += i;
            if(max < i){
                max = i;
            }
        }

        return max*nums.length - sum;
    }
}