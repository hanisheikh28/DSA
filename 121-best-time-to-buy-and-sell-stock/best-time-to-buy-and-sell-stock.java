class Solution {
    public int maxProfit(int[] prices) {
        int buyprices=prices[0],maxprofit=0;
        for(int i=1;i<prices.length;i++){
            int curprofit = prices[i]-buyprices;
            if(prices[i]<buyprices){
                buyprices = prices[i];
            }
            if(curprofit>maxprofit){
                maxprofit=curprofit;
            }
        }
        return maxprofit;
    }
}