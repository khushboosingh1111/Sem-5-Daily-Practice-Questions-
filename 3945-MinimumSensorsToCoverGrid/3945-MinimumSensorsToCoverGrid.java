// Last updated: 4/27/2026, 10:51:25 PM
class Solution {
    public int minSensors(int n, int m, int k) {
        int creq=2*k+1;
        int a=(m+creq-1)/creq;
        int b=(n+creq-1)/creq;
        return b*a;
    }
}