// Last updated: 8/6/2025, 10:12:52 AM
class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        return countSubarraysLessEqual(nums, right) - countSubarraysLessEqual(nums, left - 1);
    }

    private int countSubarraysLessEqual(int[] nums, int bound) {
        int count = 0, current = 0;
        for (int num : nums) {
            if (num <= bound) {
                current++;
            } else {
                current = 0;
            }
            count += current;
        }
        return count;
    }
}
