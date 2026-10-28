class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int i : piles){
            if(max < i){
                max =i ;
            }
        }

        int l = 1 ;
        int r = max ;
        while(l < r){
            int m = l + (r-l)/2;

            int hours = 0;
            for(int p : piles){
                hours += (p + m - 1)/ m;
            }

            if(hours <= h){
                r = m;
            }else{
                l = m + 1;
            }
        }

        return l;
    }
}