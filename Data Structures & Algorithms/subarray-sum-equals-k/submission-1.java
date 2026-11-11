class Solution {
    public int subarraySum(int[] nums, int k) {

        int sum = 0;

        HashMap<Integer,Integer> hm = new HashMap<>();
        int rem;
        int count=0;

        hm.put(0,1);

        for(int n:nums){

            sum+=n;
            rem = sum-k;

            if(hm.containsKey(rem)){
                count+= hm.get(rem);
            }

            hm.put(sum, hm.getOrDefault(sum,0)+1);
        }

        return count;
        
    }
}