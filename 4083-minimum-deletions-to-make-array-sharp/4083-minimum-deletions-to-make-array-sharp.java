class Solution {
    public int minDeletions(int[] nums) {
        List<Integer> ls = new ArrayList<>();

        ls.add(nums[0]);
        for(int i  = 1 ; i < nums.length ; i++){
            if((nums[i] ^ nums[i-1]) != 0){
                ls.add(nums[i]);
            }
        }

        return (nums.length - ls.size());
    }
}