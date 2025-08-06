// Last updated: 8/6/2025, 10:11:27 AM
class Solution {
    private int abc(int dice,int face,int target,int [][] dp){
        if(dice==0 && target==0){
            return dp[0][0]=1;
        }
        else if(dice<=0 || target <=0){
            return 0;
        }
        else if(dp[dice][target]!=-1){
            return dp[dice][target];
        }
        int ways=0;
        int module=1000_000_007;
        for(int i=1;i<=face;i++){
            ways+=abc(dice-1,face,target-i,dp);
            ways%=module;
        }
        dp[dice][target]=ways;
        return ways;

    }
    public int numRollsToTarget(int n, int k, int target) {
        int [][] dp=new int [n+1][target+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
        return abc(n,k,target,dp);
        
    }
}