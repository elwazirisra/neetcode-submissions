class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;


        while(left < right){
            int mid = left + (right - left) / 2;

            if(nums[mid] > nums [right]){ //if mid is bigger than the left side then we know it is part of the big values
                left = mid +1;
                
            }
            else{
                right = mid;
            }
  


        }
        return nums[left];
    }
}
