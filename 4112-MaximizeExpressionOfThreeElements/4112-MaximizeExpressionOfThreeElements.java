// Last updated: 4/27/2026, 10:50:44 PM
class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length-1]+nums[nums.length-2]-nums[0];
    }
}