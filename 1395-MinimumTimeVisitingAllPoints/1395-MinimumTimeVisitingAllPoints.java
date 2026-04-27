// Last updated: 4/27/2026, 10:54:06 PM
class Solution {
    public int minTimeToVisitAllPoints(int[][] p){                                                                                   
        int ans = 0;
        for (int i = 1; i < p.length; i++) {
            ans += Math.max(
                Math.abs(p[i][0] - p[i - 1][0]),
                Math.abs(p[i][1] - p[i - 1][1])
            );
        }
        return ans;
    }
}                                                                                                                                                     