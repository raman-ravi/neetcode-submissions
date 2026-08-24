class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())
        return false;

        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();

        Arrays.sort(cs);
        Arrays.sort(ct);

        int index=0;

        while(index < cs.length && index < ct.length){
            if(cs[index]!=ct[index])
            return false;
        
        index++;
        }

       return true;



    }
}
