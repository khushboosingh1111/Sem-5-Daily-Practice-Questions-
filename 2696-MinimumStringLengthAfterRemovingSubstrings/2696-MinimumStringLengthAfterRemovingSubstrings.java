// Last updated: 2/3/2026, 3:15:52 PM
1class Solution {
2
3    public int minLength(String s) {
4        // Continue processing while "AB" or "CD" substrings exist
5        while (s.contains("AB") || s.contains("CD")) {
6            if (s.contains("AB")) {
7                // Remove all occurrences of "AB"
8                s = s.replace("AB", "");
9            } else if (s.contains("CD")) {
10                // Remove all occurrences of "CD"
11                s = s.replace("CD", "");
12            }
13        }
14
15        return s.length();
16    }
17}