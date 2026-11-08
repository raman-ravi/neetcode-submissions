class Number implements Comparable<Number>{

    int num;
    int freq;

    Number(int num, int freq){
        this.num = num;
        this.freq = freq;
    }

    public int compareTo(Number that){
        return that.freq-this.freq;
    }

}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Number> pq = new PriorityQueue<>();

        for(Map.Entry<Integer,Integer> entry: count.entrySet()){

            Number number = new Number(entry.getKey(),entry.getValue());
            pq.offer(number);
        }

        int[] res = new int[k];
        int index = 0;

        while(index<k){

            Number number = pq.poll();
            res[index] = number.num;
            index++;
        }

        return res;


        
    }
}
