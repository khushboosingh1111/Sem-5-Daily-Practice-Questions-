// Last updated: 5/15/2026, 8:50:07 PM
1class Solution {
2    public int findMin(int[] nums) {
3        int n = nums.length - 1;
4        int last = nums[n];
5        int left = 0, right = n;
6        while (left < right) {
7            int mid = (left + right) >> 1;
8            if (nums[mid] > last) left = mid + 1;
9            else right = mid;
10        }
11
12        return nums[left];
13    }
14}