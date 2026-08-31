class Solution {
    public String minWindow(String s, String t) {
        int [] t_count = new int [128];
        int right = 0;
        int left = 0;
        int minWindow = Integer.MAX_VALUE;
        int found = 0;
        int to_find = t.length();
        String result_string = "";

        //frequency of the letters in t
        for(int i = 0; i<t.length(); i++){
            t_count[t.charAt(i)] ++;
        } 

        while(right < s.length()){
            t_count[s.charAt(right)]--;
            if(t_count[s.charAt(right)] >= 0){
                found++;
            }
            while(found == to_find){
                if(minWindow > right - left +1){
                    minWindow = right - left + 1;
                    result_string = s.substring(left, right + 1);
                }
               
                
                t_count[s.charAt(left)] ++;
                if(t_count[s.charAt(left)] > 0){
                    found --;
                }
                left ++;
            

            }
            right ++;
        }
        return result_string;
        
    }
}
