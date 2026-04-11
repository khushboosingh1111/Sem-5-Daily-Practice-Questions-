// Last updated: 4/11/2026, 12:44:19 PM
1class Solution {
2    public int minimumDistance(int[] nums) {
3        int n = nums.length;
4        int ans = Integer.MAX_VALUE;
5        int prev1[] = new int[n+1];
6        int prev2[] = new int[n+1];
7        for(int i=0;i<n+1;i++){
8            prev1[i] = prev2[i] = -1;
9        }
10        
11        for(int i=0;i<n;i++){
12            int value = nums[i];
13            if(prev2[value] != -1){
14                ans = Math.min(ans, (i-prev2[value]));
15            }
16            prev2[value] = prev1[value];
17            prev1[value] = i;
18        }
19        return (ans==Integer.MAX_VALUE)? -1: 2*ans;
20    }
21}