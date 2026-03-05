// Last updated: 3/5/2026, 9:05:22 PM
1class Solution {
2    public int minOperations(String s) {
3        int start0 = 0;
4        
5        for (int i = 0; i < s.length(); i++) {
6            if (i % 2 == 0) {
7                if (s.charAt(i) == '1') {
8                    start0++;
9                }
10            } else {
11                if (s.charAt(i) == '0') {
12                    start0++;
13                }
14            }
15        }
16        
17        return Math.min(start0, s.length() - start0);
18    }
19}