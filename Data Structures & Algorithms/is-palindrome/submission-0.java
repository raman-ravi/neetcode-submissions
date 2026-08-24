class Solution {
    public boolean isPalindrome(String s) {

        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "");

        StringBuffer sb = new StringBuffer(cleaned);

        sb.reverse();

        if(cleaned.equalsIgnoreCase(sb.toString())){
            return true;
        }
        return false;
        
    }
}
