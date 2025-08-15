// Last updated: 8/16/2025, 12:03:46 AM
class Solution {
    public boolean isPowerOfFour(int n) {
         return (n & (n - 1)) == 0 && n % 3 == 1;
    }
}