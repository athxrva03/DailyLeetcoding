class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int count = 1;
        int max = 1;

        for(int i = 0 ; i < nums.length -1 ; i++){
            if(nums[i] < nums[i+1]){
                count++;
            }else{
                max = Math.max(max, count);
                count = 1;
            }
        }
        max = Math.max(max , count);
        count = 1;
        
        for(int i = 0 ; i < nums.length - 1 ; i++){
            if(nums[i] > nums[i+1]){
                count++;
            }else{
                max = Math.max(max , count );
                count = 1;
            }
       }
       max = Math.max(max , count );

       return max;
    }
}