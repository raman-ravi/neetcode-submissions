class Solution {
    public int maxProfit(int[] prices) {

        int l=0;
        int r=1;

        int currProfit = 0;
        int totalProfit = 0;

        while(r<prices.length){

            if(prices[l]>prices[r]){
                currProfit=0;
                l=r;
                r++;
            } else {
                currProfit = (prices[r]-prices[l]);
                l=r;
                r++;
            }

            totalProfit+= currProfit;
        }

        return totalProfit;
        
    }
}