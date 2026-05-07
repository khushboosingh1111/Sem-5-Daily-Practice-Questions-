// Last updated: 5/7/2026, 7:17:50 PM
1class Solution {
2    public int minOperations(int[][] grid, int x) {
3        int m = grid.length, n = grid[0].length;
4        int[] arr = new int[m * n];
5        int k = 0;
6        for (int[] row : grid) {
7            for (int val : row) arr[k++] = val;
8        }
9        int mod = arr[0] % x;
10        for (int val : arr) {
11            if (val % x != mod) return -1;
12        }
13        Arrays.sort(arr);
14        int median = arr[arr.length / 2];
15        long ops = 0;
16        for (int val : arr) ops += Math.abs(val - median) / x;
17        return (int) ops;
18    }
19}