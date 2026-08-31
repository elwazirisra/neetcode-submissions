class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        HashSet <Character> unique_substring = new HashSet<>();
        int max_length =0;

        while(right < s.length()){
            if(!(unique_substring.contains(s.charAt(right)))){
                unique_substring.add(s.charAt(right));
                right ++;
                max_length = Math.max(unique_substring.size() , max_length);
            }
            else{
                unique_substring.remove(s.charAt(left));
                left ++;
            }
            
        }

        return max_length;
        
    }
}
