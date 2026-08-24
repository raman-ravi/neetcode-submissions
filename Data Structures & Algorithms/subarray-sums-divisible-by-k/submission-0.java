class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        int prefixSum = 0;
        int count = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);


        for(int n:nums){
            prefixSum= (prefixSum+n)%k;

            if(prefixSum<0)
            prefixSum+=k;


            count+= hm.getOrDefault(prefixSum,0);
            

            hm.put(prefixSum, hm.getOrDefault(prefixSum,0)+1);
        }

        return count;
        
    }
}

