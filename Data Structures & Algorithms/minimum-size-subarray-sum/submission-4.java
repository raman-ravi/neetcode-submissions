class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int n = nums.length;
        int windowEnd = 0;
        int windowStart = 0;
        int sum = 0;
        int len = 0;
        int minLen = Integer.MAX_VALUE;

        while(windowEnd<n){

            //expansion
            sum+=nums[windowEnd];

            if(sum>=target){
                len = windowEnd-windowStart+1;
                minLen = Math.min(minLen,len);

                //shrinking
                while(windowStart<windowEnd && sum>=target){
                    sum-= nums[windowStart];
                    windowStart++;
                    if(sum>=target){
                        len = windowEnd-windowStart+1;
                        minLen = Math.min(minLen,len);
                    }
                }
            }
            windowEnd++;
        }

        return (minLen == Integer.MAX_VALUE)?0:minLen;
        
    }
}