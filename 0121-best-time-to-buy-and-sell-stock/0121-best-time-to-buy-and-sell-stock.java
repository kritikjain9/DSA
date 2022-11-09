class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        
        int buyDay = 0, sellDay = 0;
        
        while(sellDay < prices.length){
            profit = Math.max(profit, prices[sellDay] - prices[buyDay]);
            if(prices[sellDay] < prices[buyDay]){
                buyDay = sellDay;
            }
            
            sellDay++;
        }
        
        return profit;
    }
}