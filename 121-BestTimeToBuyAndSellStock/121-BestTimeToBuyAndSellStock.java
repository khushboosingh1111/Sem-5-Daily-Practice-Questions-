// Last updated: 8/6/2025, 10:16:34 AM
class Solution {
    public int maxProfit(int[] prices) {
      int max=0;
      int min=Integer.MAX_VALUE;
      for(int i=0;i<prices.length;i++){
        if(prices[i]<=min){
            min=prices[i];
        }
        //min=Math.min(prices[i],min);if(prices[i]>min) in if cond.
        else{
            max=Math.max(max,prices[i]-min);
        }
      }
      return max;  
    }
}