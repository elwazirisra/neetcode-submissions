class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;

        int left = 0;
        int right = (row * column) - 1;

        while (left <= right){
            int mid = left + (right - left)/2;
            int mid_element = matrix[mid / column][mid % column];

            if(mid_element == target){
                return true;
            }
            if(mid_element > target){
                right = mid -1 ;
            }
            else if(mid_element < target){
                left = mid + 1 ;
            }


            
        }
        return false;
        
    }
}
