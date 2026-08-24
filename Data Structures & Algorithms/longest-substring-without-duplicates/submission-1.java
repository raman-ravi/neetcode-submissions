class Solution {
    public int lengthOfLongestSubstring(String s) {

        int startWindow = 0;
        int endWindow = 0;

        int longest = Integer.MIN_VALUE;

        int len = 0;

        int n = s.length();

        if(n==0) return 0;

        HashSet<Character> hs = new HashSet<>();

        while(endWindow<n){

            char ch = s.charAt(endWindow);

            if(hs.contains(ch)){

                while(startWindow<endWindow && hs.contains(ch)){
                    hs.remove(s.charAt(startWindow));
                    startWindow++;
                }
            }

            hs.add(ch);

            longest = Math.max(longest, endWindow-startWindow+1);
            endWindow++;



        }
        return (longest==Integer.MIN_VALUE?1:longest);


        
    }
}
