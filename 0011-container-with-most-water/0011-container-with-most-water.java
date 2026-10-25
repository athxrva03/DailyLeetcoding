class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int area = 0;
        while(left < right){
            int l = Math.min(height[left] , height[right]);
            int b = right - left;

            area = Math.max(area , l*b );

            if(Math.min(height[left] ,height[right]) == height[left]){
                left++;
            }else{
                right--;
            }
        }

        return area;
    }
}