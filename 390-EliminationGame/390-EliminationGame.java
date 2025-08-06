// Last updated: 8/6/2025, 10:14:42 AM
class Solution {
    public int lastRemaining(int n) {
        return n==1?1:2*(1+n/2-lastRemaining(n/2));
    }
}