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

        Map<Character, Integer> count = new HashMap<>();

        PriorityQueue<Number> pq = new PriorityQueue<>();

        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry: count.entrySet()){

            Number number = new Number(entry.getKey(), entry.getValue());
            pq.offer(number);
        }

        StringBuilder sb = new StringBuilder();

        while(!pq.isEmpty()){

            Number number = pq.poll();

            while(number.freq>0){
                sb.append(number.ch);
                number.freq--;
            }
        }

        return sb.toString();
        
    }
}