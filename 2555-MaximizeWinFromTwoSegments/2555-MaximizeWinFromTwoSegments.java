// Last updated: 1/22/2026, 11:05:43 PM
class Solution {
    public int maximizeWin(int[] prizePositions, int k) {
        if (2*k+1 >= prizePositions[prizePositions.length-1] - prizePositions[0]) return prizePositions.length;
        int[] dp = new int[prizePositions.length+1];
        int res = 0;
        int left = 0;

        for (int right = 0; right < prizePositions.length; right++) {
            while (prizePositions[right] - k > prizePositions[left]) {
                left++;
            }
            dp[right+1] = Math.max(dp[right], right-left+1);
            res = Math.max(res, dp[left] + right-left+1);
        }
        return res;
    }
}