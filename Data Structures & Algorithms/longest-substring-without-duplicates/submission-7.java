class Solution {
    public int lengthOfLongestSubstring(String s) {

        int windowStart = 0;
        int windowEnd = 0;
        int n = s.length();
        int maxLen = Integer.MIN_VALUE;
        int len;

        HashSet<Character> hs = new HashSet<>();

        while(windowEnd<n){
            char ch = s.charAt(windowEnd);

            //shrinkig
            if(hs.contains(ch)){

                while(windowStart<windowEnd && hs.contains(ch)){

                    hs.remove(s.charAt(windowStart));
                    windowStart++;

                }
            }
            
            len = windowEnd-windowStart+1;
            maxLen = Math.max(maxLen,len);

            hs.add(ch);
            windowEnd++;

        }

        return maxLen==Integer.MIN_VALUE?0:maxLen;
        
    }
}
