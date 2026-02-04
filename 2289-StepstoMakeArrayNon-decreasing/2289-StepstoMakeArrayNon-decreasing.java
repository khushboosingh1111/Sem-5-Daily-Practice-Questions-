// Last updated: 2/4/2026, 11:08:14 PM
1class Solution {
2    public int totalSteps(int[] nums) {
3        int n = nums.length;
4        int ans = 0;
5        Stack<Integer> valStack = new Stack<>(); //value
6        Stack<Integer> stepStack = new Stack<>(); //steps
7        valStack.push(nums[n - 1]);
8        stepStack.push(0);
9        for (int i = n - 2; i >= 0; i--) {
10            int count = 0;
11            while (!valStack.isEmpty() && nums[i] > valStack.peek()) {
12                count = Math.max(count + 1, stepStack.peek());
13                valStack.pop();
14                stepStack.pop();
15            }
16            ans = Math.max(ans, count);
17            valStack.push(nums[i]);
18            stepStack.push(count);
19        }
20
21        return ans;
22    }
23}