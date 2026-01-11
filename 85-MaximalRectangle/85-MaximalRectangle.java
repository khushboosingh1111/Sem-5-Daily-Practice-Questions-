// Last updated: 1/11/2026, 7:42:40 PM
1class Solution {
2    public int maximalRectangle(char[][] matrix) {
3        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
4            return 0;
5        }
6        int m = matrix.length;
7        int n = matrix[0].length;
8        int[] heights = new int[n];
9        int[] leftBoundaries = new int[n];
10        int[] rightBoundaries = new int[n];
11        Arrays.fill(rightBoundaries, n);
12        int maxRectangle = 0;
13        for (int i = 0; i < m; i++) {
14            int left = 0;
15            int right = n;
16            updateHeightsAndLeftBoundaries(matrix[i], heights, leftBoundaries, left);
17            updateRightBoundaries(matrix[i], rightBoundaries, right);
18            maxRectangle = calculateMaxRectangle(heights, leftBoundaries, rightBoundaries, maxRectangle);
19        }
20        return maxRectangle;
21    }
22    private void updateHeightsAndLeftBoundaries(char[] row, int[] heights, int[] leftBoundaries, int left) {
23        for (int j = 0; j < heights.length; j++) {
24            if (row[j] == '1') {
25                heights[j]++;
26                leftBoundaries[j] = Math.max(leftBoundaries[j], left);
27            } else {
28                heights[j] = 0;
29                leftBoundaries[j] = 0;
30                left = j + 1;
31            }
32        }
33    }
34    private void updateRightBoundaries(char[] row, int[] rightBoundaries, int right) {
35        for (int j = rightBoundaries.length - 1; j >= 0; j--) {
36            if (row[j] == '1') {
37                rightBoundaries[j] = Math.min(rightBoundaries[j], right);
38            } else {
39                rightBoundaries[j] = right;
40                right = j;
41            }
42        }
43    }
44    private int calculateMaxRectangle(int[] heights, int[] leftBoundaries, int[] rightBoundaries, int maxRectangle) {
45        for (int j = 0; j < heights.length; j++) {
46            int width = rightBoundaries[j] - leftBoundaries[j];
47            int area = heights[j] * width;
48            maxRectangle = Math.max(maxRectangle, area);
49        }
50        return maxRectangle;
51    }
52}