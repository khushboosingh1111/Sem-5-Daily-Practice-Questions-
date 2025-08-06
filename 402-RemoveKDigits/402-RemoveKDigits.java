// Last updated: 8/6/2025, 10:14:38 AM
class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        for (char c : num.toCharArray()) {
            while (k > 0 && !st.isEmpty() && st.peek() > c) {
                st.pop();
                k--;
            }
            st.push(c);
        }
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : st) {
            sb.append(c);
        }
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
