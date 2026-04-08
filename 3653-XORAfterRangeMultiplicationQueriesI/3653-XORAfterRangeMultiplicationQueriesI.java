// Last updated: 4/8/2026, 8:27:50 PM
1class Solution {
2    private static final int MOD = 1_000_000_007;
3    public int xorAfterQueries(int[] nums, int[][] queries) {
4        int n = nums.length;
5        for (int[] q : queries) {
6            int l = q[0];
7            int r = q[1];
8            int k = q[2];
9            int v = q[3];
10            for (int i = l; i <= r; i += k) {
11                nums[i] = (int) (((long) nums[i] * v) % MOD);
12            }
13        }
14        int res = 0;
15        for (int x : nums) {
16            res ^= x;
17        }
18        return res;
19    }
20}