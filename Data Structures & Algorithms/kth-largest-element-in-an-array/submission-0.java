class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Integer val=0;


        for(int num:nums){
            pq.offer(num);
        }

        for(int i=0;i<k;i++){
            val = pq.poll();
        }

        return val;
        
    }
}
