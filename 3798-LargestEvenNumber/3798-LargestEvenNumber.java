// Last updated: 1/8/2026, 10:14:31 PM
1class Solution {
2    public String largestEven(String s) {
3         int lastTwoIndex = s.lastIndexOf('2');
4
5        // If no '2' exists, cannot form even number
6        if (lastTwoIndex == -1) {
7            return "";
8        }
9
10        // Keep everything up to last '2'
11        return s.substring(0, lastTwoIndex + 1);
12    }
13}
14  