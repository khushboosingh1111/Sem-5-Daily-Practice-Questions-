// Last updated: 4/27/2026, 10:52:58 PM
class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int negCount = 0;
        int minAbs = Integer.MAX_VALUE;

        for (int[] row : matrix) {
            for (int val : row) {
                if (val < 0) negCount++;
                int absVal = Math.abs(val);
                sum += absVal;
                minAbs = Math.min(minAbs, absVal);
            }
        }

        if (negCount % 2 == 0) {
            return sum;
        } else {
            return sum - 2L * minAbs;
        }
    }
}
