class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = -1;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] < 0){
                n++;
            }
        }

        for(int i = 0 ;  i < nums.length ; i++){
            nums[i] = nums[i] * nums[i];
        }

        int[] arr = new int[nums.length];

        int m = n + 1;
        int a = 0;
        while(n >= 0 && m < nums.length){
            if(nums[n] > nums[m]){
                arr[a] = nums[m];
                a++;
                m++;
            }else{
                arr[a] = nums[n];
                a++;
                n--;
            }
        }

        while(m < nums.length){
            arr[a] = nums[m];
            a++;
            m++;
        }

        while(n >= 0){
            arr[a] = nums[n];
            a++;
            n--;
        }

        return arr;
    }
}