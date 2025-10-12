// Last updated: 10/12/2025, 5:14:34 PM
class Solution {
    public int[] countBits(int n) {
        int[] dp=new int[n+1];
        for(int i=1;i<=n;i++){
            dp[i]=dp[i/2]+(i%2);
        }
        return dp;
    }
}