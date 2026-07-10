// Last updated: 7/10/2026, 10:15:21 PM
1class Solution {
2    public int[] pathExistenceQueries(
3        int n,
4        int[] nums,
5        int maxDiff,
6        int[][] queries
7    ) {
8        int[] idx = new int[n];
9        int[] pos = new int[n];
10
11        for (int i = 0; i < n; i++) {
12            idx[i] = i;
13        }
14
15        Integer[] ord = new Integer[n];
16        for (int i = 0; i < n; i++) {
17            ord[i] = i;
18        }
19
20        Arrays.sort(ord, (a, b) -> Integer.compare(nums[a], nums[b]));
21
22        for (int i = 0; i < n; i++) {
23            idx[i] = ord[i];
24            pos[idx[i]] = i;
25        }
26
27        int m = 32 - Integer.numberOfLeadingZeros(n);
28
29        int[][] f = new int[n][m];
30
31        int left = 0;
32        for (int i = 0; i < n; i++) {
33            while (left < i && nums[idx[i]] - nums[idx[left]] > maxDiff) {
34                left++;
35            }
36            f[i][0] = left;
37        }
38
39        for (int j = 1; j < m; j++) {
40            for (int i = 0; i < n; i++) {
41                f[i][j] = f[f[i][j - 1]][j - 1];
42            }
43        }
44
45        int[] ans = new int[queries.length];
46
47        for (int k = 0; k < queries.length; k++) {
48            int x = pos[queries[k][0]];
49            int y = pos[queries[k][1]];
50
51            if (x > y) {
52                int t = x;
53                x = y;
54                y = t;
55            }
56
57            if (x == y) {
58                ans[k] = 0;
59                continue;
60            }
61
62            int step = 0;
63
64            for (int i = m - 1; i >= 0; i--) {
65                if (f[y][i] > x) {
66                    y = f[y][i];
67                    step += 1 << i;
68                }
69            }
70
71            ans[k] = f[y][0] <= x ? step + 1 : -1;
72        }
73
74        return ans;
75    }
76}