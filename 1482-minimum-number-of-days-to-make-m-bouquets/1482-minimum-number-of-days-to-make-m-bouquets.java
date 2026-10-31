class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if((long) m * k > n){
            return -1;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i : bloomDay){
            if(max < i){
                max = i;
            }

            if(min > i){
                min = i;
            }
        }

        int l = min;
        int r = max;
        while(l <= r){
            int mid = l + (r-l)/2;

            int counter = 0;
            int bouquets = 0;
            for(int i = 0 ; i < bloomDay.length ; i++){
                if(bloomDay[i] <= mid) {
                    counter ++;

                    if(counter == k){
                        bouquets++;
                        counter = 0;
                    }

                }else{
                    counter = 0;
                }
            }

            if(bouquets >= m){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }
}