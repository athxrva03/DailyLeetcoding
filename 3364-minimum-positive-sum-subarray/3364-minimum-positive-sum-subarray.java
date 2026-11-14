class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min = Integer.MAX_VALUE;;
        for(int i = l  ; i <= r ; i++){
            int sum = 0;
            for(int j = 0 ; j < i ; j++){
                sum += nums.get(j);
            }

            if(sum > 0){
                min = Math.min(min , sum);
            }

            for(int j = 0 ; j < nums.size() - i ; j++){
                sum += nums.get(j + i) - nums.get(j);

                if(sum > 0){
                   min = Math.min(min , sum);
                }
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}