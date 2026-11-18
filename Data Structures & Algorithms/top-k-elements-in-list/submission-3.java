class Element implements Comparable<Element>{

    int element;
    int freq;

    Element(int element,int freq) {
        this.element = element;
        this.freq = freq;
    }

    @Override
    public int compareTo(Element that){
        return that.freq-this.freq;
    }


}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> hm = new HashMap<>();

        PriorityQueue<Element> pq = new PriorityQueue<>();

        for(int num:nums){
            hm.put(num, hm.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){

            Element ele = new Element(entry.getKey(),entry.getValue());

            pq.offer(ele);
        }

        int[] res = new int[k];

        for(int i=0;i<k;i++){

            Element ele = pq.poll();

            res[i] = ele.element;

        }

        return res;


        
    }
}
