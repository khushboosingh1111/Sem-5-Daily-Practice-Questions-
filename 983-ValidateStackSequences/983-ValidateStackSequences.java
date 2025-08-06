// Last updated: 8/6/2025, 10:12:17 AM
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int i = 0;
        for(int x: pushed){
            st.push(x);
            while(!st.isEmpty() && st.peek()==popped[i]){
                st.pop();
                i++;
            }
        }
        return st.isEmpty();
    }
}