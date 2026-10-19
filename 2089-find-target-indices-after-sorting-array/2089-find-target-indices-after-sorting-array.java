class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int less = 0;
        int tcount = 0;
        for(int num : nums){
            if(num < target){
                less++;
            }else if(num == target){
                tcount++;
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < tcount ; i++){
            list.add(less + i);
        }

        return list;
    }
}