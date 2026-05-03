// Last updated: 5/3/2026, 6:59:51 PM
1class Solution {
2
3    public boolean rotateString(String s, String goal) {
4        // Check if the lengths are different
5        if (s.length() != goal.length()) return false;
6
7        // Create a new string by concatenating 's' with itself
8        String doubledString = s + s;
9
10        // Use contains to search for 'goal' in 'doubledString'
11        // If contains return true, 'goal' is a substring
12        return doubledString.contains(goal);
13    }
14}