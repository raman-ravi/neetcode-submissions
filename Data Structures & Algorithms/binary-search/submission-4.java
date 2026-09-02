class Solution {
    public int search(int[] nums, int target) {

        int n = nums.length;
        int l = 0;
        int r= n-1;
        int mid;

        if(n==0) return -1;

        if(n==1 && nums[0]==target)
         return 0;
        else if(n==1 && nums[0]!=target)
         return -1;

        while(l<=r){
            mid = (l+r)/2;

            if(target==nums[mid]){
                return mid;
            } else if(target<nums[mid]){
                r= mid-1;
            }else{
                l=mid+1;
            }
        }
        return -1;
        
    }
}
