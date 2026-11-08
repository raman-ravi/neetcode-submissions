class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int res=0;

        for(int i:nums){

            pq.offer(i);
        }

        for(int i=0;i<k;i++){

            res = pq.poll();

        }

        return res;
        
    }
}
