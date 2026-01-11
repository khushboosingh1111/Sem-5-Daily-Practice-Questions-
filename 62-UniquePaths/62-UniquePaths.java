// Last updated: 1/12/2026, 12:23:43 AM
1class Solution {
2    public int uniquePaths(int m, int n) {
3        int [] dp=new int[n];
4        dp[0]=1;
5        for(int i=0;i<m;i++){
6            for(int j=1;j<n;j++){
7                dp[j]+=dp[j-1];
8            }
9        }
10        return dp[n-1];
11
12    }
13}