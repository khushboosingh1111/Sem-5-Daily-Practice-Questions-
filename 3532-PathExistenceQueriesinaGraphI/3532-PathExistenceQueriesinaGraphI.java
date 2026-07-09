// Last updated: 7/9/2026, 11:01:37 PM
1class Solution {
2    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
3        int[] cmp = new int[n];
4
5        // Build prefix component array
6        for (int i = 1; i < n; i++) {
7            cmp[i] = cmp[i - 1];
8            if (nums[i] - nums[i - 1] > maxDiff) {
9                cmp[i]++;
10            }
11        }
12
13        boolean[] res = new boolean[queries.length];
14
15        // Answer each query
16        for (int i = 0; i < queries.length; i++) {
17            int u = queries[i][0];
18            int v = queries[i][1];
19
20            res[i] = (cmp[u] == cmp[v]);
21        }
22
23        return res;
24    }
25}