// Last updated: 1/29/2026, 8:23:15 AM
1class Solution {
2    public int kthGrammar(int n, int k) {
3        return solve(n,k);
4    }
5    public static int solve(int n,int k){
6        if(n==1){
7            return 0;
8        }
9        int mid=(int)Math.pow(2,n-1)/2;
10        if(k<=mid){
11            return solve(n-1,k);
12        }
13        else{
14            return 1-solve(n-1,k-mid);
15        }
16    }
17}