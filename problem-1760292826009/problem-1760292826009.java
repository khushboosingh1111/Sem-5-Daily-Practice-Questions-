// Last updated: 10/12/2025, 11:43:46 PM
class Solution {
    public boolean divisorGame(int n) {
        boolean[] dp=new boolean[n+1];
        for(int i=2;i<=n;i++){
            // Try every divisor x of i where 0 < x < i and i % x == 0.
            for(int j=1;j<=Math.sqrt(i);j++){
                if((i%j==0) && (dp[i-j]==false)){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[n];
    }
}