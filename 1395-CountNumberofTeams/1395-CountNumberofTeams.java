// Last updated: 1/20/2026, 10:17:23 PM
1class Solution {
2    public int numTeams(int[] rating) {
3        int n=rating.length;
4        int teams=0;
5        for(int i=1;i<n-1;i++){
6            int countLeftSmaller=0;
7            int countLeftLarger=0;
8            int countRightSmaller=0;
9            int countRightLarger=0;
10            for(int j=0;j<i;j++){
11                if(rating[i]>rating[j]){
12                    countLeftLarger++;
13                }
14                else if(rating[i]<rating[j]){
15                    countLeftSmaller++;
16                }
17            }
18            for(int k=i+1;k<n;k++){
19                if(rating[i]>rating[k]){
20                    countRightLarger++;
21                }
22                else if(rating[i]<rating[k]){
23                    countRightSmaller++;
24                }
25            }
26            teams+=(countLeftSmaller*countRightLarger)+(countLeftLarger*countRightSmaller);
27        }
28        return teams;
29    }
30}