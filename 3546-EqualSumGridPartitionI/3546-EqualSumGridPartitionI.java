// Last updated: 3/25/2026, 11:00:10 PM
1class Solution {
2    public boolean canPartitionGrid(int[][] grid) {
3        int m = grid.length, n = grid[0].length;
4        long total = 0;
5        for (int[] row : grid)
6            for (int x : row)
7                total += x;
8        if ((total & 1) == 1) return false;
9        long target = total / 2, sum = 0;
10        for (int i = 0; i < m - 1; i++) {
11            for (int j = 0; j < n; j++)
12                sum += grid[i][j];
13            if (sum == target) return true;
14        }
15        sum = 0;
16        for (int j = 0; j < n - 1; j++) {
17            for (int i = 0; i < m; i++)
18                sum += grid[i][j];
19            if (sum == target) return true;
20        }
21        
22        return false;
23    }
24}