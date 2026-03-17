// Last updated: 3/17/2026, 12:04:06 PM
1class Solution {
2    public boolean check(int[] nums) {
3        int n = nums.length;
4        int drops = 0;
5        for (int i = 0; i < n; i++) {
6            if (nums[i] > nums[(i + 1) % n]) {
7                drops++;
8            }
9        }
10        return drops <= 1;
11    }
12}