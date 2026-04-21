// Last updated: 4/21/2026, 8:04:45 PM
1class Solution {
2    public int[] findDegrees(int[][] matrix) {
3        int n = matrix.length;
4        int[] ans = new int[n];
5        for (int i = 0; i < n; i++) {
6            int degree = 0;
7            for (int j = 0; j < n; j++) {
8                if (matrix[i][j] == 1) {
9                    degree++;
10                }
11            }
12            ans[i] = degree;
13        }
14
15        return ans;
16    }
17}