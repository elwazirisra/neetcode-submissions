class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

        for(String word: strs){
            encoded.append(word.length()).append("?").append(word);
        }
        return encoded.toString();

    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList();
        //3:cat4:love
        int i = 0;
        int j = 0;

        while(i < str.length()){
            j = i;
            while(str.charAt(j) != '?'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i , j));
            i = j + 1;
                decoded.add(str.substring(i , i + length));
            i += length;

        }
        return decoded;
   

    }
}
