// Last updated: 2/6/2026, 12:47:41 PM
1public class Solution {
2    public int maxFrequency(int[] nums, int k) {
3        int orig = 0;
4        for (int num : nums) {
5            if (num == k) orig++;
6        }
7        int maxGain = 0;
8        for (int m = 1; m <= 50; m++) {
9            if (m == k) continue;
10            int current = 0, maxCurrent = 0;
11            for (int num : nums) {
12                current += (num == m) ? 1 : (num == k) ? -1 : 0;
13                current = Math.max(current, 0);
14                maxCurrent = Math.max(maxCurrent, current);
15            }
16            maxGain = Math.max(maxGain, maxCurrent);
17        }
18        return orig + maxGain;
19    }
20}