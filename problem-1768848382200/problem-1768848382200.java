// Last updated: 1/20/2026, 12:16:22 AM
1class Solution {
2
3    public int totalSteps(int[] nums) {
4
5        int n = nums.length;
6        int ans = 0;
7
8        Stack<Integer> valStack = new Stack<>();
9        Stack<Integer> stepStack = new Stack<>();
10
11        valStack.push(nums[n - 1]);
12        stepStack.push(0);
13
14        for (int i = n - 2; i >= 0; i--) {
15
16            int count = 0;
17
18            while (!valStack.isEmpty() && nums[i] > valStack.peek()) {
19                count = Math.max(count + 1, stepStack.peek());
20                valStack.pop();
21                stepStack.pop();
22            }
23
24            ans = Math.max(ans, count);
25            valStack.push(nums[i]);
26            stepStack.push(count);
27        }
28
29        return ans;
30    }
31}
32