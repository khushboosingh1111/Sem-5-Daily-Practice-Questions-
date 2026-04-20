// Last updated: 4/20/2026, 9:52:26 PM
1class Solution {
2    public int maxDistance(int[] colors) {
3        int n = colors.length;
4        int res = 0; // the maximum distance between two houses of different colors
5        // traverse the indices of two houses and maintain the maximum distance
6        for (int i = 0; i < n; i++) {
7            for (int j = i + 1; j < n; j++) {
8                if (colors[i] != colors[j]) {
9                    res = Math.max(res, j - i);
10                }
11            }
12        }
13        return res;
14    }
15}