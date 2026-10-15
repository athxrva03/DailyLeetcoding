class Solution {
    public int removeElement(int[] nums, int val) {
        int l = 0;
        int r = nums.length -1;
        
        while (l <= r) {
            if (nums[l] == val) {
                if(nums[r] != val){
                    nums[l] = nums[r];
                    l++;
                }
                r--;
            }
            else
            {
                l++;
            }
        }
        
        return l;
    }
}
