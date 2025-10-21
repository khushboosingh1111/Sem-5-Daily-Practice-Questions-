// Last updated: 10/21/2025, 11:02:37 AM
class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int w=0;
        for(int s:nums){
            w+=s;
        }
        int t=w/2;
        if(w%2!=0){
            return false;
        } 
        Boolean[][] dp=new Boolean[n+1][t+1];
        return fn(nums,nums.length-1,t,dp);

    }
    public boolean fn(int[] nums,int n,int w,Boolean[][] dp){
        if(w==0){
            return true; 
        }
        if (w == 0) return true;
        if (n < 0) return false;
        if(dp[n][w]!=null){
            return dp[n][w];
        }
        if(nums[n]<=w){
            dp[n][w]=fn(nums,n-1,w-nums[n],dp) || fn(nums,n-1,w,dp);
        }
        else{
            dp[n][w]=fn(nums,n-1,w,dp);
        }
        return dp[n][w];

    }
}