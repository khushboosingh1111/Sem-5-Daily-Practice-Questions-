// Last updated: 1/22/2026, 11:02:30 PM
1class Solution {
2    int mod = 1000000007;
3    public int monkeyMove(int n) {
4        long res = helper(2,n);
5        return (int)((res-2+mod)%mod);
6    }
7    public long helper(int base, int n){
8        if(n == 0){
9            return 1;
10        }
11        long h = helper(base,n/2);
12        long res = (h*h)%mod;
13        if(n % 2 == 1){
14            res = (res*base)%mod;
15        }
16        return res;
17    }
18}