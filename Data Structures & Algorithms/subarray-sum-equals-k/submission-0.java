class Solution {
    public int subarraySum(int[] nums, int k) {

        int prefixSum = 0;
        int count = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);


        for(int n:nums){
            prefixSum+=n;

            int target = prefixSum-k;

            if(hm.containsKey(target)){
                count+= hm.get(target);
            }

            hm.put(prefixSum, hm.getOrDefault(prefixSum,0)+1);
        }

        return count;
        
    }
}