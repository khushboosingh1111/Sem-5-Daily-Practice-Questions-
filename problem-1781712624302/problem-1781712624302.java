// Last updated: 6/17/2026, 9:40:24 PM
1public class Solution {
2
3    public String processStr(String s) {
4        StringBuilder result = new StringBuilder();
5        for (char ch : s.toCharArray()) {
6            if (ch == '*') {
7                if (result.length() > 0) result.deleteCharAt(
8                    result.length() - 1
9                );
10            } else if (ch == '#') {
11                result.append(result.toString());
12            } else if (ch == '%') {
13                result.reverse();
14            } else {
15                result.append(ch);
16            }
17        }
18        return result.toString();
19    }
20}