class Number implements Comparable<Number>{
    char ch;
    int freq;

    Number(char ch,int freq){
        this.ch = ch;
        this.freq = freq;
    }

    public int compareTo(Number that){

        return that.freq-this.freq;
    }
}

class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> count = new HashMap<>();

        for (char c: s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Number> pq = new PriorityQueue<>();

        for(Map.Entry<Character, Integer> entry : count.entrySet()){

            Number num = new Number(entry.getKey(),entry.getValue());
            pq.offer(num);
        }

        StringBuilder sb = new StringBuilder();

        while(!pq.isEmpty()){

            Number num = pq.poll();

            while(num.freq>0){
                sb.append(num.ch);
                num.freq--;
            }

        }

        return sb.toString();
        
    }
}