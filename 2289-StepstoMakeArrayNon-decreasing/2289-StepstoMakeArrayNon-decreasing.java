// Last updated: 1/24/2026, 10:50:40 PM
1class Solution {
2    public int totalSteps(int[] nums) {
3        int n = nums.length;
4        int ans = 0;
5
6        Stack<Integer> valStack = new Stack<>(); //value or element
7        Stack<Integer> stepStack = new Stack<>(); //steps or count
8        
9
10        valStack.push(nums[n - 1]); //element
11        stepStack.push(0); //count
12
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