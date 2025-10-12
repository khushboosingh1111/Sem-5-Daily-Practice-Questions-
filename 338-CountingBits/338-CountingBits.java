// Last updated: 10/12/2025, 5:21:41 PM
class Solution {
    public int[] countBits(int n) {
        //top down
        // int[] dp=new int[n+1];
        // for(int i=1;i<=n;i++){
        //     dp[i]=dp[i/2]+(i%2);
        // }
        // return dp;

        //calling bootom up-
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        for(int i=0;i<=n;i++){
            cb(i,dp);
        }
        return dp;
    }
    //bottom up
    public int cb(int i,int[] dp){
        if(i==0){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        dp[i]=cb(i/2,dp)+(i%2);
        return dp[i];
    }
}