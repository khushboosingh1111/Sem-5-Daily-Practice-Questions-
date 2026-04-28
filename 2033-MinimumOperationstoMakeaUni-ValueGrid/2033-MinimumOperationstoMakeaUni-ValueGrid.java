// Last updated: 4/28/2026, 10:36:42 PM
class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length, n = grid[0].length;
        int[] arr = new int[m * n];
        int k = 0;
        for (int[] row : grid) {
            for (int val : row) arr[k++] = val;
        }
        int mod = arr[0] % x;
        for (int val : arr) {
            if (val % x != mod) return -1;
        }
        Arrays.sort(arr);
        int median = arr[arr.length / 2];
        long ops = 0;
        for (int val : arr) ops += Math.abs(val - median) / x;
        return (int) ops;
    }
}