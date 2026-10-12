class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[n + m];

        int i = 0;
        int j = 0;
        int k = 0;
        if(n == 0){
            return;
        }
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                res[k] = nums1[i];
                k++;
                i++;
            }else{
                res[k] = nums2[j];
                k++;
                j++;
            }
        }

        while(i < m){
            res[k] = nums1[i];
            k++;
            i++;
        }

        while(j < n){
            res[k] = nums2[j];
            k++;
            j++;
        }

        int a = 0;
        while(a < (n+m)){
            nums1[a] = res[a];
            a++;
        }
    }
}