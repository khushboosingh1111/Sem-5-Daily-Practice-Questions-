// Last updated: 2/3/2026, 3:51:38 PM
1class Solution {
2
3    public int minLength(String s) {
4        Stack<Character> stack = new Stack<>();
5
6        // Iterate over each character in the input string
7        for (int i = 0; i < s.length(); i++) {
8            char currentChar = s.charAt(i);
9
10            // If the stack is empty, simply push the current character
11            if (stack.isEmpty()) {
12                stack.push(currentChar);
13                continue;
14            }
15
16            // Check for "AB" pattern, remove the pair by popping from the stack
17            if (currentChar == 'B' && stack.peek() == 'A') {
18                stack.pop();
19            }
20            // Check for "CD" pattern, remove the pair by popping from the stack
21            else if (currentChar == 'D' && stack.peek() == 'C') {
22                stack.pop();
23            }
24            // Otherwise, push the current character onto the stack
25            else {
26                stack.push(currentChar);
27            }
28        }
29
30        return stack.size();
31    }
32}