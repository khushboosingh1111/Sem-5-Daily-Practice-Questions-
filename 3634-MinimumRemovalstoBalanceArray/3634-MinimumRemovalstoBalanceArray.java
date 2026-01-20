// Last updated: 1/20/2026, 10:29:13 PM
1class Solution {
2    public int minRemoval(int[] nums, int k) {
3        if(nums.length == 1) return 0;
4        Arrays.sort(nums);
5        int n = nums.length;
6
7        int left = 0;
8        int ans = 1;
9
10        for (int right = 0; right < n; right++) {
11            while ((long) nums[right] > (long) nums[left] * k) {
12                left++;
13            }
14            ans = Math.max(ans, right - left + 1);
15        }
16
17        return n - ans;
18    }
19}