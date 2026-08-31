class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;


        while(left < right){
            int mid = left + (right - left) / 2;

            if(nums[mid] > nums [right]){ // because if nums[mid] is bigger than teh right most element then  that is where the rotation happened and the smallest element is probably on the rigth side
                left = mid +1;
                
            }
            else{
                right = mid;
            }
  


        }
        return nums[left];
    }
}
