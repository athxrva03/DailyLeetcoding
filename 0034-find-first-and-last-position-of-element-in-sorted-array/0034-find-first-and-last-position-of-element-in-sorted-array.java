class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f = boundary(nums , target , true);

        if(f == -1){
            return new int[] {-1, -1};
        }

        int l = boundary(nums , target , false);

        return new int[] {f,l};
    }

    public int boundary(int[] nums, int target , boolean b){
        int l = 0;
        int r = nums.length -1;

        int ans = -1;
        while(l <= r){
            int m = l + (r-l)/2;

            if(nums[m] == target){
                ans = m;
                if(b){
                    r = m -1;
                }else{
                    l = m + 1;
                }
            }else if(nums[m] > target){
                r = m -1;
            }else{
                l = m + 1;
            }
        }
        return ans;
    }
}