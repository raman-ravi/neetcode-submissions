class Solution {
    public int trap(int[] height) {

        int leftMax = 0;
        int rightMax = 0;

        int n = height.length;

        int l = 0;
        int r = n-1;
        int ans = 0;

        while(l<r){

            if(leftMax < height[l]){
                leftMax = Math.max(leftMax , height[l]);
            }
            if(rightMax<height[r]){
                rightMax = Math.max(rightMax, height[r]);
            }
            if(leftMax<rightMax){
                ans+= leftMax - height[l];
                l++;
            }else{
                ans+= rightMax - height[r];
                r--;
            }

        }
        return ans;
        
    }
}
