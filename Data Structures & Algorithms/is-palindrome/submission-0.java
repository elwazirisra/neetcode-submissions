class Solution {
    public boolean isPalindrome(String s) {
        String ss = s.replaceAll("[^a-zA-Z0-9]", "");

        String reverse = new StringBuilder(ss).reverse().toString();
        String reverse_lower = reverse.toLowerCase();
        String ss_lower = ss.toLowerCase();
        System.out.print(ss_lower);
        if(reverse_lower.equals(ss_lower)){
            return true;
        }
       return false;

        
    }
}
