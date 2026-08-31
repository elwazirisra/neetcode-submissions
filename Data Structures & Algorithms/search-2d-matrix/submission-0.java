class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
    
        int column = matrix[0].length;

        int left = 0;
        int right = (row * column)-1;
        int mid= 0;

        while(left <= right){
            mid = left + (right - left)/2;
            int mid_element = matrix[mid/column][mid%column];

            if(target < mid_element){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }

            if(target == mid_element){
                return true;
            }
            
        }
        
        return false;
        
    }
}
