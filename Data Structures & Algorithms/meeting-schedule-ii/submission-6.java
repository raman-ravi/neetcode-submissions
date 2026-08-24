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
    public int minMeetingRooms(List<Interval> intervals) {

        // if (intervals == null || intervals.isEmpty()) return 0;

        // int size = intervals.size();

        intervals.sort((a,b)-> a.start-b.start);


        // int meetroom = 0;

        // int endtime = intervals.get(0).end;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(Interval inter:intervals){

            if(!pq.isEmpty() && pq.peek() <= inter.start){
                pq.poll();
            }

            pq.offer(inter.end);

        }


        return pq.size();



    }
}
