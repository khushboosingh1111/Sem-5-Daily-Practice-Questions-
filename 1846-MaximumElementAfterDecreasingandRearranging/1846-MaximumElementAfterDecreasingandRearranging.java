// Last updated: 6/28/2026, 10:25:30 PM
1class Solution {
2    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
3        Arrays.sort(arr);
4        int ans = 1;
5        for (int i = 1; i < arr.length; i++) {
6            if (arr[i] >= ans + 1) {
7                ans++;
8            }
9        }
10        return ans;
11    }
12}