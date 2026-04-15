// Last updated: 4/15/2026, 3:43:28 PM
1class Solution {
2    public int closestTarget(String[] words, String target, int startIndex) {
3        int ans = words.length;
4        int n = words.length;
5        for (int i = 0; i < n; ++i) {
6            if (words[i].equals(target)) {
7                int dist = Math.abs(i - startIndex);
8                ans = Math.min(ans, Math.min(dist, n - dist));
9            }
10        }
11        return ans < n ? ans : -1;
12    }
13}