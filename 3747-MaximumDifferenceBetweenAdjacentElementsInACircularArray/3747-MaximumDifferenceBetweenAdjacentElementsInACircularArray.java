// Last updated: 8/6/2025, 10:09:08 AM
class Solution {
    public int maxAdjacentDistance(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }

        int max = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int difference = Math.abs(nums[i] - nums[(i + 1) % n]);
            max = Math.max(max, difference);
        }

        return max;
        
    }
}