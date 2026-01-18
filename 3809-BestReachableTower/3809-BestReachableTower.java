// Last updated: 1/18/2026, 2:09:05 PM
1class Solution {
2    public int minOperations(int[] nums, int[] target) {
3        Set<Integer> s = new HashSet<>();
4        for (int i = 0; i < nums.length; i++) {
5            if (nums[i] != target[i]) {
6                s.add(nums[i]);
7            }
8        }
9        return s.size();
10    }
11}