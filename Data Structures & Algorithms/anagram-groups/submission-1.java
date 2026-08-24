class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> hm = new HashMap<>();

        for(String s:strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sorted = String.valueOf(c);

            hm.putIfAbsent(sorted, new ArrayList<String>());
            hm.get(sorted).add(s);

        }

        return new ArrayList<>(hm.values());
        
    }
}
