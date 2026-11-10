class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        ArrayList<int[]> al = new ArrayList<>();

        int n = intervals.length;

        int i=0;

        while(i<n && intervals[i][1]<newInterval[0]){
            al.add(intervals[i]);
            i++;
        }

        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0],newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1],newInterval[1]);
            i++;
        }

        al.add(newInterval);

        while(i<n){
            al.add(intervals[i]);
            i++;
        }

        return al.toArray(new int[al.size()][2]);


        
    }
}
