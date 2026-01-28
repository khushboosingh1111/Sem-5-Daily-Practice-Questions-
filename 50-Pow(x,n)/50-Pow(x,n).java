// Last updated: 1/28/2026, 7:55:09 PM
1class Solution {
2    public double myPow(double x, int n) {
3        long N=n;          
4        if(N<0) {
5            x=1/x;
6            N=-N;
7        }
8        return solve(x,n);
9    }
10    public static double solve(double x,int n){
11        if(n==0){
12            return 1;
13        }
14        if(n==1){
15            return x;
16        }
17        double result=solve(x,n/2);;
18
19        if(n%2==0){
20            return result*result;
21        }
22        else{
23            return x*result*result;
24        }
25    }
26}