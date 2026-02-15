// Last updated: 2/15/2026, 9:24:25 PM
1class Solution {
2    public long rob(int[] nums, int[] colors) {
3        int[] arr=nums;
4        int n=arr.length;
5        long dp0=0;
6        long dp1=arr[0];
7        for(int i=1;i<n;i++){
8            long newDp0=Math.max(dp0,dp1);
9            long bestprev=dp0;
10            if(colors[i]!=colors[i-1]){
11                bestprev=Math.max(bestprev,dp1);
12            }
13            long newDp1=arr[i]+bestprev;
14            dp0=newDp0;
15            dp1=newDp1;
16        }
17        return Math.max(dp0,dp1);
18    }
19}