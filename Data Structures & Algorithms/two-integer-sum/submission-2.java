class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map <Integer, Integer> map_a = new HashMap();

        int [] two_sums = new int[2];
        
        for(int i =0; i<nums.length; i++){
            int exist = target - nums[i];

            if(!map_a.containsKey(exist)){
                map_a.put(nums[i], i);
            }else{
                two_sums [1] = i;
                two_sums [0] = map_a.get(exist);
                return two_sums;
            }

        }
        return two_sums;

        
    }
}
