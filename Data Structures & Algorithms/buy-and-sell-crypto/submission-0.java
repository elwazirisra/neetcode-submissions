class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int left_buy = 0;
        int right_sell = 1;

        while(right_sell < prices.length){
            if(prices[left_buy] < prices[right_sell]){
                max_profit = Math.max(max_profit, (prices[right_sell] - prices[left_buy]));
            }
            else{
                left_buy  = right_sell;
            
            }
                right_sell ++;

        }
        return max_profit;
        
    }
}
