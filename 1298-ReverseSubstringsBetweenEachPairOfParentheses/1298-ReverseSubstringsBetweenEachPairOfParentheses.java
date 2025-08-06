// Last updated: 8/6/2025, 10:11:25 AM
import java.util.Stack;

class Solution {
    public String reverseParentheses(String s) {
        Stack<String> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                st.push(sb.toString());
                sb.setLength(0);
            } else if (c == ')') {
                sb.reverse();
                if (!st.isEmpty()) {
                    sb = new StringBuilder(st.pop() + sb.toString());
                }
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
