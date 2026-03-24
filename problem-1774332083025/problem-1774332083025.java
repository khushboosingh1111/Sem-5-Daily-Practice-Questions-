// Last updated: 3/24/2026, 11:31:23 AM
1import java.util.Arrays;
2class Solution {
3    public int findContentChildren(int[] g, int[] s) {
4        int n = g.length;
5        int m = s.length;
6        int l = 0, r = 0;
7        Arrays.sort(g);
8        Arrays.sort(s);
9        while (l < n && r < m) {
10            if (g[l] <= s[r]) {
11                l++;
12            }
13            r++;
14        }
15        return l;
16    }
17}