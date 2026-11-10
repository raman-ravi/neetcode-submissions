class Element implements Comparable<Element>{
    int num;
    int diff;

    public Element(int num, int diff){
        this.num = num;
        this.diff = diff;

    }

    @Override
    public int compareTo(Element that){
        if (this.diff != that.diff) {
            return this.diff - that.diff; 
        }
        // 2. Tie-breaker: prefer the smaller number if differences are equal
        return this.num - that.num;
    }
}

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        PriorityQueue<Element> pq = new PriorityQueue<>();



        for(int i:arr){
            Element ele = new Element(i, Math.abs(i - x));
            pq.offer(ele);
        }


        List<Integer> al = new ArrayList<>();

        int index = 0;

        while(index<k){
            Element ele = pq.poll();
            al.add(ele.num);
            index++;
        }

        Collections.sort(al);

        return al;


        
    }
}