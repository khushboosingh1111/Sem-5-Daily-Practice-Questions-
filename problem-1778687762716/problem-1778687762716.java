// Last updated: 5/13/2026, 9:26:02 PM
1class Solution {
2
3    public int minMoves(int[] nums, int limit) {
4        int n = nums.length;
5        int[] diff = new int[2 * limit + 2];
6
7        for (int i = 0; i < n / 2; i++) {
8            int a = Math.min(nums[i], nums[n - 1 - i]);
9            int b = Math.max(nums[i], nums[n - 1 - i]);
10
11            diff[2] += 2;
12            diff[a + 1] -= 1;
13            diff[a + b] -= 1;
14            diff[a + b + 1] += 1;
15            diff[b + limit + 1] += 1;
16        }
17
18        int minOps = n;
19        int currentOps = 0;
20
21        for (int c = 2; c <= 2 * limit; c++) {
22            currentOps += diff[c];
23            minOps = Math.min(minOps, currentOps);
24        }
25
26        return minOps;
27    }
28}