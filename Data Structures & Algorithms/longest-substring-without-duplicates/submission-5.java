class Solution {
    public int lengthOfLongestSubstring(String s) {

        int startWindow = 0;
        int endWindow = 0;

        int longest = Integer.MIN_VALUE;

        int len = 0;

        int n = s.length();

        if(n==0) return 0;
        if(n==1) return 1;

        HashMap<Character,Integer> hm = new HashMap<>();

        while(endWindow<n){

            char ch = s.charAt(endWindow);

            if(hm.containsKey(ch) && hm.get(ch)>=startWindow){
                startWindow = hm.get(ch)+1;

            }



            hm.put(ch, endWindow);

            longest = Math.max(longest, endWindow-startWindow+1);
            endWindow++;



        }
        return (longest==Integer.MIN_VALUE?1:longest);


        
    }
}
