// Last updated: 11/30/2025, 10:55:55 PM
1class Solution {
2    public int trap(int[] height) {
3        int start=0;int end=height.length-1;
4        int ans=0;
5        int lm=0;
6        int rm=0;
7        while(start<end){
8            if(height[start]<height[end]){
9                if(height[start]>lm){
10                    lm=height[start++];
11                }
12                else{
13                    ans+=lm-height[start++];
14                }
15            }
16            else{
17                if(height[end]>rm){
18                    rm=height[end--];
19                }
20                else{
21                    ans+=rm-height[end--];
22                }
23            }
24
25        }
26        return ans;
27        
28    }
29}