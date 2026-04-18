// Last updated: 4/18/2026, 9:09:54 PM
1class Solution {
2    public int mirrorDistance(int n) {
3        int num=n;
4        int rev=0;
5        while(n > 0){
6            int digit = n % 10;      
7            rev = rev * 10 + digit;    
8            n = n / 10;           
9        }
10        return Math.abs(num-rev);
11    }
12}