class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = boundary(nums,target,true);

        if(first == -1){
            return new int[] {-1,-1};
        }

        int last = boundary(nums,target,false);

        return new int[] {first , last};
    }

    public int boundary(int[] nums, int target , boolean b){
        int l = 0 ;
        int r = nums.length -1;

        int ans = -1;
        while(l <= r){
            int m = l + (r-l)/2;

            if(nums[m] == target){
                ans = m;

                if(b){
                    r = m -1;
                }else{
                    l = m +1;
                }
            }else if(nums[m] < target){
                l = m + 1;
            }else{
                r = m - 1;
            }
        }

        return ans;
    }
}