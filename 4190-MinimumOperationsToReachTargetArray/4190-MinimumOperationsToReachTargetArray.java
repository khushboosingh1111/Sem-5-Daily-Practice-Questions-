// Last updated: 4/27/2026, 10:50:15 PM
class Solution {
    public int minOperations(int[] nums, int[] target) {
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target[i]) {
                s.add(nums[i]);
            }
        }
        return s.size();
    }
}