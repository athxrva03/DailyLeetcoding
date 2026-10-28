class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = 0 ;
        int sum = 0;
        for(int w : weights){
            sum += w;
            if(max < w){
                max = w;
            }
        }

        int l = max;
        int r = sum;
        while( l < r){
            int m = l + (r-l)/2;

            int d = 1;
            int s = 0;
            for(int k : weights){
                if((s + k) <= m){
                    s +=k;
                }else{
                    s = k;
                    d++;
                }
            }

            if(d > days){
                l = m + 1;
            }else{
                r = m;
            }
        }
        return l;
    }
}