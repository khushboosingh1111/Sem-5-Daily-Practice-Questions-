// Last updated: 8/6/2025, 10:11:58 AM
class Solution {
    public int longestOnes(int[] s, int k) {
         int[] count = new int[2];
        int maxCount = 0, left = 0, ans = 0;

        for (int right = 0; right < s.length; right++) {
            count[s[right]]++;
            maxCount = Math.max(maxCount, count[1]);

            while ((right - left + 1) - maxCount > k) {
                count[s[left]]--;
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}