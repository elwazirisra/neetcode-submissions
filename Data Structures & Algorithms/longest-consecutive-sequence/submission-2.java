class Solution {
    public int longestConsecutive(int[] nums) { 
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
    

        for(int i : nums){
            int length = 1;
            if(!set.contains(i - 1)){// looking for the start of the sequence
                while(set.contains(i + length)){ //o(1) lookup
                    length ++;
                }
                
            }
            count = Math.max(count, length);

        }
        return count;
        
    }
}
