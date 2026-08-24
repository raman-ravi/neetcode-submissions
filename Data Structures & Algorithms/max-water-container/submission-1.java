class Solution {
    public int maxArea(int[] heights) {

        int left =0;
        int right = heights.length-1;


        int maxArea = Integer.MIN_VALUE;

        int area = 1;
        int len;

        while(left<right){

            len = right - left;

            area = len*Math.min(heights[left],heights[right]);

            maxArea = Math.max(area, maxArea);

            if(heights[left]<heights[right])  left++;
            else right--;


        }

        return maxArea;
        
    }
}
