// Last updated: 5/1/2026, 9:43:32 PM
1class Solution {
2    public int maxRotateFunction(int[] nums) {
3        int f = 0;
4        int n = nums.length;
5        int numSum = Arrays.stream(nums).sum();
6        for (int i = 0; i < n; i++) {
7            f += i * nums[i];
8        }
9        int res = f;
10        for (int i = n - 1; i > 0; i--) {
11            f += numSum - n * nums[i];
12            res = Math.max(res, f);
13        }
14        return res;
15    }
16}