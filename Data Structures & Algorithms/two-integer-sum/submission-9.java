class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;

        int i=0;
        int j=1;

        while(i<n-1){

            if(nums[i]+nums[j]==target){
                return new int[]{i,j};
            } else if(j==n-1){
                i++;
                j=i+1;
            } else{
                j++;
            }
        }

        return new int[]{};


        
    }
}
