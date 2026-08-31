class Solution {
    public int lengthOfLongestSubstring(String s) {
     int right = 0;
     int left = 0;
     int max_length = 0;
     HashSet <Character> unique = new HashSet<>();

     while(right < s.length()){
        if(!(unique.contains(s.charAt(right)))){
            unique.add(s.charAt(right));
            max_length = Math.max(max_length, unique.size());
            right ++;
        }
        else{
            unique.remove(s.charAt(left));
            left ++;
        }
     }
     return max_length;
        
    }
}
