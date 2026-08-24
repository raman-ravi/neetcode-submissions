class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int n = nums.length;
        int startWindow = 0;
        int endtWindow = 0;
        int len = 0;
        int minLength = Integer.MAX_VALUE;
        int sum=0;

        while(endtWindow<n){
            sum+=nums[endtWindow];

            if(sum>=target){
                len = endtWindow-startWindow+1;
                minLength = Math.min(minLength, len);

                while(startWindow<endtWindow && sum>=target){
                    sum-= nums[startWindow];
                     startWindow++;
                    if(sum>=target){
                         len = endtWindow-startWindow+1;
                         minLength = Math.min(minLength, len);
                    }
                   

                }


            }

            endtWindow++;



        }

        return (minLength==Integer.MAX_VALUE?0:minLength);
        
    }
}