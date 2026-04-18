// Last updated: 4/18/2026, 9:08:56 PM
1class Solution {
2    public int mirrorDistance(int n) {
3        String s=Integer.toString(n);
4        int num=n;
5        int rev=0;
6        while(n > 0){
7            int digit = n % 10;      
8            rev = rev * 10 + digit;    
9            n = n / 10;           
10        }
11        return Math.abs(num-rev);
12    }
13}