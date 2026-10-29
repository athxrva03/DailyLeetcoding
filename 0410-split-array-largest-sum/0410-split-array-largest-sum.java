class Solution {
    public int splitArray(int[] nums, int k) {
        int max = 0;
        int sum = 0;
        for(int i : nums){
            sum += i;
            if(max < i){
                max = i;
            }
        }

        int l = max ;
        int r = sum;

        while(l < r){
            int m = l + (r - l)/2;

            int cSum = 0 ;
            int subArr = 1;
            for(int i : nums){
                if(cSum + i > m){
                    subArr++;
                    cSum = i;
                }else{
                    cSum += i;
                }
            }

            if(subArr > k){
                l = m + 1;
            }else{
                r = m;
            }
        }

        return l;
    }
}