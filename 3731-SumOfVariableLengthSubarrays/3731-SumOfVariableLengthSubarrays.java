// Last updated: 8/6/2025, 10:09:13 AM
class Solution {
    public int subarraySum(int[] nums) {
        int totalSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int start = Math.max(0, i - nums[i]);

            for (int j = start; j <= i; j++) {
                totalSum += nums[j];
            }
        }

        return totalSum;
    }
    
}