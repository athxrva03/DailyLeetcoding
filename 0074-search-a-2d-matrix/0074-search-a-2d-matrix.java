class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0){
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int l = 0 ;
        int r = (rows * cols) -1;
        
        while(l <= r){
            int m = l + (r-l)/2;

            int row = m / cols;
            int col = m % cols;

            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] < target){
                l = m + 1;
            }else{
                r = m - 1;
            }
        }

        return false;
    }
}