// Last updated: 1/10/2026, 7:52:13 PM
1class Solution {
2    public int minimumDeleteSum(String s1, String s2) {
3        char [] S1=s1.toCharArray();
4        char [] S2=s2.toCharArray();
5        int [][] dp=new int[S1.length+1][S2.length+1];
6
7        for(int i=1;i<=S1.length;i++){
8            dp[i][0]=dp[i-1][0]+S1[i-1];
9        }
10        for(int j=1;j<=S2.length;j++){
11            dp[0][j]=dp[0][j-1]+S2[j-1];
12        }
13        for(int k=1;k<=S1.length;k++){
14            for(int l=1;l<=S2.length;l++){
15                if(S1[k-1]==S2[l-1]){
16                    dp[k][l]=dp[k-1][l-1];
17                }
18                else{
19                    dp[k][l]=Math.min(dp[k-1][l]+S1[k-1],dp[k][l-1]+S2[l-1]);
20                }
21            }
22        }
23        return dp[S1.length][S2.length];
24        
25    }
26}