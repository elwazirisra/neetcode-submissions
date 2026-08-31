class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        Map <Character, Integer> map_s = new HashMap<>();
        Map <Character, Integer> map_t = new HashMap<>();

        for(int i = 0; i<s.length(); i++ ){
            char c1 = s.charAt(i);
            map_s.put(c1, map_s.getOrDefault(c1, 0) + 1);

            char c2 = t.charAt(i);
            map_t.put(c2, map_t.getOrDefault(c2, 0) + 1);

        }

        return map_s.equals(map_t);
      
    }
}
