// Last updated: 8/6/2025, 10:16:00 AM
class Solution {
    public int trailingZeroes(int n) {
        int res = 0;
        while (n > 0) {
            n /= 5;
            res += n;
        }
    return res;
    }
}