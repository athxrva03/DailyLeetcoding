class Solution {
    public int maxDistance(int[] position, int m) {
        int n = position.length - 1;

        Arrays.sort(position);

        int l = 1;
        int r = position[n] - position[0];

        while(l <= r){
            int mid = l + (r-l)/2;

            int bp = 1;
            int bd = position[0];

            for(int i = 1 ; i < position.length ; i++){
                if(position[i] - bd >= mid){
                    bp++;
                    bd = position[i];
                }
            }

            if(bp < m){
                r = mid -1;
            }else{
                l = mid + 1;
            }
        }
        return l-1;
    }
}