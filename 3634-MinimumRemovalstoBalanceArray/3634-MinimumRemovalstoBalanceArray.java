// Last updated: 1/20/2026, 10:28:03 PM
1class Solution {
2    public int minRemoval(int[] nums, int k) {
3       Arrays.sort(nums);
4        int n = nums.length;
5
6        int left = 0;
7        int ans = 1;
8
9        for (int right = 0; right < n; right++) {
10            while ((long) nums[right] > (long) nums[left] * k) {
11                left++;
12            }
13            ans = Math.max(ans, right - left + 1);
14        }
15
16        return n - ans;
17    }
18}