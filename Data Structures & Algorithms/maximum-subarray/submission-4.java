class Solution {
    public int maxSubArray(int[] nums) {

        int MaxSum = nums[0];

        int CurrSum = 0;

        for(int num:nums){

            if(CurrSum<0){
                CurrSum = 0;
            }

            CurrSum+=num;
            MaxSum = Math.max(MaxSum,CurrSum);
            
        }

        return MaxSum;
        
    }
}
