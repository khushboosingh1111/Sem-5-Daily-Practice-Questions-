// Last updated: 4/27/2026, 10:52:43 PM
class Solution {
    public int totalSteps(int[] nums) {
        int n = nums.length;
        int ans = 0;
        Stack<Integer> valStack = new Stack<>(); //value
        Stack<Integer> stepStack = new Stack<>(); //steps
        valStack.push(nums[n - 1]);
        stepStack.push(0);
        for (int i = n - 2; i >= 0; i--) {
            int count = 0;
            while (!valStack.isEmpty() && nums[i] > valStack.peek()) {
                count = Math.max(count + 1, stepStack.peek());
                valStack.pop();
                stepStack.pop();
            }
            ans = Math.max(ans, count);
            valStack.push(nums[i]);
            stepStack.push(count);
        }

        return ans;
    }
}