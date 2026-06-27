// Last updated: 6/27/2026, 11:20:37 PM
1class Solution {
2    public int maximumLength(int[] nums) {
3        Map<Long, Integer> cnt = new HashMap<>();
4        for (int num : nums) {
5            cnt.merge((long) num, 1, Integer::sum);
6        }
7        int oneCnt = cnt.getOrDefault(1L, 0);
8        // ans is at least the number of occurrences of 1, rounded down to an odd number
9        int ans = (oneCnt & 1) == 1 ? oneCnt : oneCnt - 1;
10        cnt.remove(1L);
11        for (long num : cnt.keySet()) {
12            int res = 0;
13            long x = num;
14            while (cnt.containsKey(x) && cnt.get(x) > 1) {
15                res += 2;
16                x *= x;
17            }
18            ans = Math.max(ans, res + (cnt.containsKey(x) ? 1 : -1));
19        }
20
21        return ans;
22    }
23}