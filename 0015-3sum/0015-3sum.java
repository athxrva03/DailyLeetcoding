class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2 ; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            int target = -1 * nums[i];
            int l = i + 1;
            int r = nums.length -1;
            while(l < r){
                int sum = nums[l] + nums[r];
                if(sum == target){
                    List<Integer> ls = new ArrayList<>();
                    ls.add(nums[i]);
                    ls.add(nums[l]);
                    ls.add(nums[r]);
                    
                    list.add(ls); 

                    while(l < r && nums[l] == nums[l+1]){l++;}
                    while(l < r &&  nums[r] == nums[r-1]){r--;}

                    l++;
                    r--;
                }else if(sum > target){
                    r--;
                }else{
                    l++;
                }
            }   
        }
        return list;
    }
}