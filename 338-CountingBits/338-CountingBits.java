// Last updated: 2/28/2026, 10:23:09 PM
1class Solution {
2    public int[] countBits(int n) {
3        int[] ans=new int[n+1];
4        for(int i=0;i<=n;i++){
5            int c=0;
6            for(int j=0;j<31;j++){
7                if((i & (1 << j)) != 0){
8                    c++;
9                }
10                ans[i]=c;
11            }
12        }
13        return ans;
14    }
15}