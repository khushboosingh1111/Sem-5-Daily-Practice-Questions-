// Last updated: 8/6/2025, 10:09:05 AM
class Solution {
    public int countArrays(int[] original, int[][] bounds) {
        int n = original.length;
        int l = bounds[0][0];
        int r = bounds[0][1];

        for (int i = 1; i < n; i++) {
            int sub = original[i] - original[i - 1];

            int nL = Math.max(bounds[i][0], l + sub);
            int nR = Math.min(bounds[i][1], r + sub);

            if (nL > nR) {
                return 0;
            }

            l = nL;
            r = nR;
        }

        return r - l + 1;
    }
}