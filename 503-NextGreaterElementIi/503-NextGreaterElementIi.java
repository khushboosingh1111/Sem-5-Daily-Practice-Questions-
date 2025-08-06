// Last updated: 8/6/2025, 10:13:55 AM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int[] arr=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = -1; 
        }
        int n=nums.length;
        for (int i = 0; i < 2 * n; i++) {
            while (!st.isEmpty() && nums[st.peek()] < nums[i % n]) {
                arr[st.pop()] = nums[i % n];
            }
            if (i < n) {
                st.push(i);
            }
        }

        return arr;
    }
}