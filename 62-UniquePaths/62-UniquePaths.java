// Last updated: 1/12/2026, 7:39:55 PM
1class Solution {
2    public int uniquePaths(int m, int n) {
3    int N = m + n - 2;
4    int k = Math.min(m - 1, n - 1);
5
6    long res = 1;
7
8    for (int i = 1; i <= k; i++) {
9        res = res * (N - k + i) / i;
10    }
11
12    return (int) res;
13
14    }
15}