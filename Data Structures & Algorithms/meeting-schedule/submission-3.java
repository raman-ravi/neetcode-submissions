/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {

        if(intervals.size()==0){
            return true;
        }

        Collections.sort(intervals,(a,b)-> a.start-b.start);

        int i=1;

        int end = intervals.get(0).end;

        while(i<intervals.size()){

            if(intervals.get(i).start < end){
                return false;
            } else{
                end = intervals.get(i).end;
            }
            i++;
        }

        return true;



    }
}
