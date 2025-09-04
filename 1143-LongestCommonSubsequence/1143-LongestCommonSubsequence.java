// Last updated: 9/4/2025, 12:29:00 PM
class Solution {
    public int numDistinct(String s, String t) {
        // dp array initialize
        int[][] dp = new int[s.length()][t.length()];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return distinctSubseq(s, t, 0, 0, dp);
    }

    // recursion + memoization
    public static int distinctSubseq(String s, String t, int i, int j, int[][] dp) {
        // agar t pura match ho gaya
        if (j == t.length()) {
            return 1;
        }
        // agar s pura traverse ho gaya par t abhi bacha hai
        if (i == s.length()) {
            return 0;
        }
        // agar already computed hai
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int inc = 0, exc = 0;
        // match case
        if (s.charAt(i) == t.charAt(j)) {
            inc = distinctSubseq(s, t, i + 1, j + 1, dp);
        }
        // exclude case
        exc = distinctSubseq(s, t, i + 1, j, dp);

        return dp[i][j] = inc + exc;
    }
}