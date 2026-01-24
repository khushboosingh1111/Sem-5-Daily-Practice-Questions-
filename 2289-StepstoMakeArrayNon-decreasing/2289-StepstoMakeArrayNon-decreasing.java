// Last updated: 1/24/2026, 10:52:38 PM
1class Solution {
2    public int totalSteps(int[] nums) {
3        int n = nums.length;
4        int ans = 0;
5        int[] steps = new int[n];
6        int[] stk = new int[n]; 
7        int top = -1; 
8
9        for (int i = n - 1; i >= 0; i--) {
10            int maxStep = 0;
11            while (top >= 0 && nums[i] > nums[stk[top]]) {
12                maxStep = Math.max(maxStep + 1, steps[stk[top]]);
13                top--;
14            }
15            steps[i] = maxStep;
16            ans = Math.max(ans, steps[i]);
17            stk[++top] = i;
18        }
19        return ans;
20    }
21}