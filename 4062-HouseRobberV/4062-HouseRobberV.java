// Last updated: 4/27/2026, 10:50:55 PM
class Solution {
    public long rob(int[] nums, int[] colors) {
        int[] arr=nums;
        int n=arr.length;
        long dp0=0;
        long dp1=arr[0];
        for(int i=1;i<n;i++){
            long newDp0=Math.max(dp0,dp1);
            long bestprev=dp0;
            if(colors[i]!=colors[i-1]){
                bestprev=Math.max(bestprev,dp1);
            }
            long newDp1=arr[i]+bestprev;
            dp0=newDp0;
            dp1=newDp1;
        }
        return Math.max(dp0,dp1);
    }
}