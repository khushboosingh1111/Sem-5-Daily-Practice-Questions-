// Last updated: 4/27/2026, 10:52:30 PM
class Solution {
    public int maximizeWin(int[] prizePositions, int k) {
        int n = prizePositions.length;
        int[] cover = new int[n];
        int[] next = new int[n];

        // Step 1: Two pointers
        int right = 0;
        for (int left = 0; left < n; left++) {
            while (right < n && prizePositions[right] <= prizePositions[left] + k) {
                right++;
            }
            cover[left] = right - left;
            next[left] = right;
        }

        // Step 2: Suffix maximum
        int[] best = new int[n + 1];
        best[n] = 0;
        for (int i = n - 1; i >= 0; i--) {
            best[i] = Math.max(best[i + 1], cover[i]);
        }

        // Step 3: Combine two segments
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, cover[i] + best[next[i]]);
        }

        return ans;
    }
}