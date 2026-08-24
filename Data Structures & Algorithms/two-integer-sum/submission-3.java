class Solution {
    public int[] twoSum(int[] nums, int target) {

        
    int i=0;
    int j=1;

    while(i<nums.length-1){
        if(nums[i]+nums[j]==target && i!=j){
            return new int[]{i,j};

        }else if(j==nums.length-1){
            i++;
            j=1;
        }else{
            j++;
        }
    }

    return new int[]{};
        
    }
}
