class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map <String, List<String>> anagrams = new HashMap();

        for( String word : strs){

            char [] char_array =  word.toCharArray();
            Arrays.sort(char_array);
            String sorted_word = new String(char_array);

            anagrams.computeIfAbsent(sorted_word, sw -> new ArrayList<>()).add(word);

        }
        return new ArrayList<>(anagrams.values());

        
    }
}
