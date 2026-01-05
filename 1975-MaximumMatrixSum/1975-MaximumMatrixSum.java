// Last updated: 1/5/2026, 9:24:44 PM
1class Solution {
2    public long maxMatrixSum(int[][] matrix) {
3        long sum = 0;
4        int negCount = 0;
5        int minAbs = Integer.MAX_VALUE;
6
7        for (int[] row : matrix) {
8            for (int val : row) {
9                if (val < 0) negCount++;
10                int absVal = Math.abs(val);
11                sum += absVal;
12                minAbs = Math.min(minAbs, absVal);
13            }
14        }
15
16        if (negCount % 2 == 0) {
17            return sum;
18        } else {
19            return sum - 2L * minAbs;
20        }
21    }
22}
23