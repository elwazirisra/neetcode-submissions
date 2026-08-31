class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int max = 0;
        HashSet <Character> unique = new HashSet();

        while(right < s.length()){
            if(!(unique.contains(s.charAt(right)))){
                unique.add(s.charAt(right));
                max = Math.max(max, unique.size());
                right++;
               

            }
            else{
                unique.remove(s.charAt(left));
                left++;
            }
         

        }
        return max;
   
        
    }
}
