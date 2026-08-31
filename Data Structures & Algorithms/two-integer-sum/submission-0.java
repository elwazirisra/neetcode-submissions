class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map <Integer, Integer> map_1 = new HashMap();
        int [] array = new int[2];

        for(int n = 0; n < nums.length; n++){
            

            int sum = target - nums[n];

            if(map_1.containsKey(sum)){
                array[1] = n;
                array[0] = map_1.get(sum);
            }
            map_1.put(nums[n], n);
        }

        return array;

        
    }
}
