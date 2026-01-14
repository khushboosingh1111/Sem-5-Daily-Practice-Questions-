// Last updated: 1/14/2026, 4:35:59 PM
1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        if(n<=0){
4            return false;
5        }
6       return (n&(n-1))==0;
7	}
8}