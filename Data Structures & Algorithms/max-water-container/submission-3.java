class Solution {
    public int maxArea(int[] heights) {

        int n = heights.length;

        int i=0;
        int j=n-1;
        int currMax;
        int max = Integer.MIN_VALUE;

        while(i<j){

            currMax = (j-i)*(Math.min(heights[i],heights[j]));
            max = Math.max(max,currMax);
            
            if(heights[i]<=heights[j]){
                i++;

            } else {
                j--;
            }

        }

        return max;
        
    }
}
