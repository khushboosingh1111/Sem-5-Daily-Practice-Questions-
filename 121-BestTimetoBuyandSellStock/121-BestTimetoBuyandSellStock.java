// Last updated: 1/13/2026, 11:07:25 AM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int max=0;
4        int min=Integer.MAX_VALUE;
5        for(int i=0;i<prices.length;i++){
6            if(prices[i]<=min){
7                min=prices[i];
8            }
9            else{
10                max=Math.max(max,prices[i]-min);
11            }
12        }
13      return max;  
14    }
15}