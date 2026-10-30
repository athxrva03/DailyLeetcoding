class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        if(n1 > n2){
            return findMedianSortedArrays(nums2,nums1);
        }
        int half = (n1 + n2 + 1) / 2;

        int l = 0;
        int r = n1;
        while(l <= r){
            int c1 = l + (r-l)/2;
            int c2 = half - c1;

            int lp1 = c1 > 0 ? nums1[c1 - 1] : Integer.MIN_VALUE;
            int rp1 = c1 < n1 ? nums1[c1] : Integer.MAX_VALUE;

            int lp2 = c2 > 0 ? nums2[c2 - 1] : Integer.MIN_VALUE;
            int rp2 = c2 < n2 ? nums2[c2] : Integer.MAX_VALUE;

            if(lp1 <= rp2 && lp2 <= rp1){
                if((n1+n2) % 2 != 0){
                    return Math.max(lp1,lp2);
                }else{
                    return (double) (Math.min(rp1,rp2) + Math.max(lp1,lp2))/2.0;
                }
            }else if(lp1 > rp2){
                r = c1 - 1;
            }else{
                l = c1 + 1;
            }
        }

        return -1;
    }
}