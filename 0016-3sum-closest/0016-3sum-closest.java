class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int min = Integer.MAX_VALUE;
        int minSum = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length -2 ; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            int l = i + 1;
            int r = nums.length - 1 ;
            while(l < r){
                int sum  = nums[i] + nums[l] + nums[r];
                if(sum == target){
                    return sum;
                }else if(sum > target){
                    int diff = Math.abs(target - sum);
                    if(diff < min){
                        min = diff; 
                        minSum = sum;
                    }
                    r--;
                }else{
                    int diff = Math.abs(target - sum);
                    if(diff < min){
                        min = diff; 
                        minSum = sum;
                    }
                    l++;
                }
            }
        }

        return minSum;
    }
}