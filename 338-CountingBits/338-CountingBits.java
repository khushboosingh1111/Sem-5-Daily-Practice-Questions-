// Last updated: 2/28/2026, 10:48:49 PM
1class Solution {
2    public int[] countBits(int n) {
3        int[] ans=new int[n+1];
4        for(int i=0;i<=n;i++){
5            int c=0;
6            int num=i;
7            while(num>0){
8                c++;
9                num=num&(num-1);
10            }
11            ans[i]=c;
12        }
13        return ans;
14    }
15}