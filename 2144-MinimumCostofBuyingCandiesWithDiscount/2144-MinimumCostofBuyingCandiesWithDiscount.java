// Last updated: 6/1/2026, 11:37:40 PM
1class Solution {
2    public int minimumCost(int[] cost) {
3        Arrays.sort(cost);
4        int res = 0;
5        int n = cost.length;
6        for (int i = n - 1; i >= 0; --i) {
7            if ((n - 1 - i) % 3 != 2) {
8                res += cost[i];
9            }
10        }
11        return res;
12    }
13}