class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];

        int k = 0 ;
        int n1 = 0;
        int n2 = 0;

        while(n1 < nums1.length && n2 < nums2.length){
            if(nums1[n1] > nums2[n2]){
                arr[k] = nums2[n2];
                k++;
                n2++;
            }else{
                arr[k] = nums1[n1];
                k++;
                n1++;
            }
        }

        while(n1 < nums1.length){
            arr[k] = nums1[n1];
            n1++;
            k++;
        }

        while(n2 < nums2.length){
            arr[k] = nums2[n2];
            n2++;
            k++;
        }

        if(k % 2 != 0){
            return arr[k/2];
        }else{
            return ((double) arr[ k/2 -1 ] + arr[ k/2 ])/2;
        }
    }
}