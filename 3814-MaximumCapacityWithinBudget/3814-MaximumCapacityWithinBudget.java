// Last updated: 2/13/2026, 8:35:55 PM
1class Solution {
2    public int maxCapacity(int[] costs, int[] capacity, int budget) {
3        int n = costs.length;
4        // Sort the values by (cost, capacity)
5        int[][] items = new int[n][2];
6        for (int i = 0; i < n; i++)
7            items[i] = new int[]{costs[i], capacity[i]};
8        Arrays.sort(items, (a, b) -> a[0] != b[0] ? (a[0] - b[0]) : (a[1] - b[1]));
9
10        // Calculate max capacity prefix
11        int[] cap_prefix = new int[n];
12        for (int i = 0; i < n; i++)
13            cap_prefix[i] = Math.max(i > 0 ? cap_prefix[i - 1] : 0, items[i][1]);
14
15        // Use two pointers to find best match
16        int result = 0, r = n - 1;
17        for (int l = 0; l < n; l++) {
18            int cst = items[l][0], cap = items[l][1];
19            if (cst >= budget) 
20                break;
21
22            // One machine
23            result = Math.max(result, cap_prefix[l]);
24
25            // Two machines
26            // Try to find another machine to increase capacity with budget left
27            int limit = budget - cst;
28            while (r >= 0 && items[r][0] >= limit) 
29                r--;
30
31            // Take only in range [0, i) to avoid using the same machine twice
32            int j = Math.min(r, l - 1);
33            if (j >= 0)
34                result = Math.max(result, cap + cap_prefix[j]);
35        }
36
37        return result;
38    }
39}