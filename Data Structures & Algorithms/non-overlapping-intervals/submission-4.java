class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a,b) -> a[1]-b[1]);

        int remove=0;

        int[] next = intervals[0];

        int i=1;

        while(i<intervals.length){

            if(intervals[i][0]>=next[1]){
                next = intervals[i];
            }else{
                remove++;
            }

            i++;


        }

        return remove;
        
    }
}
