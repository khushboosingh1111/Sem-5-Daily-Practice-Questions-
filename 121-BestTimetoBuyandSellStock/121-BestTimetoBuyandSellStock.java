// Last updated: 3/6/2026, 10:28:39 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int ans=0;
4        int min=Integer.MAX_VALUE;
5        for(int p:prices){
6            ans=Math.max(ans,p-min);
7            min=Math.min(min,p);
8        }
9      return ans;  
10    }
11}