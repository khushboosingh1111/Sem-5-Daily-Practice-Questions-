// Last updated: 1/14/2026, 11:38:07 AM
1class Solution {
2    public boolean isPowerOfTwo(int n) {
3       return isPower(n); 
4    }
5    public static boolean isPower(int n) {
6        if(n<=0)return false;
7		while(n>1) {
8			if(n%2!=0)return false;
9			n=n/2;
10		}
11		return true;
12	}
13}