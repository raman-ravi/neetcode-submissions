class Element implements Comparable<Element>{
    int num;
    int diff;

    public Element(int num, int diff){
        this.num = num;
        this.diff = diff;

    }

    @Override
    public int compareTo(Element that){
        if(this.diff!=that.diff){
            return this.diff-that.diff;
        }

        return this.num-that.num;
    }
}

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        PriorityQueue<Element> pq = new PriorityQueue<>();

        for(int ar:arr){

            Element ele = new Element(ar, Math.abs(ar-x));

            pq.offer(ele);

        }

        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0;i<k;i++){
            Element ele = pq.poll();

            al.add(ele.num);

        }

        Collections.sort(al);
        return al;



        
    }
}