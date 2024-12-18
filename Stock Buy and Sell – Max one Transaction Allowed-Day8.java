class Solution {
    public int maximumProfit(int prices[]) {

        int n = prices.length;
        int maxprofit = 0;
        int min = prices[0];
        
        for (int i = 1; i<n; i++){
            if(min > prices[i]){
                min = prices[i];
            
            }
        
               int profit = prices[i] - min;
            if (maxprofit<profit){
                maxprofit= profit;
            }
            
        }
        
        return maxprofit;
    }
}
