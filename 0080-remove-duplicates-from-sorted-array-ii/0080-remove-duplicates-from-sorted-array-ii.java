class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        int k = 0;
        for(int i : nums){
            if(k < 2 || i != nums[k-2] ){ 
                nums[k] = i;
                k++;
            }
        }
        return k;
    }
}