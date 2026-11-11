class Solution {
    public int maxArea(int[] heights) {

        int i=0;
        int j= heights.length-1;
        int ans = 0;
        int currVol;

        while(i<j){
            currVol = (j-i)*Math.min(heights[i],heights[j]);
            ans = Math.max(currVol,ans);

            if(heights[i]<heights[j]){
                i++;
            }else{
                j--;
            }
        }
        return ans;
        
    }
}
