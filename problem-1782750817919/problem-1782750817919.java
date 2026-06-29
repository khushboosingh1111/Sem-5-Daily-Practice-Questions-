// Last updated: 6/29/2026, 10:03:37 PM
1class Solution {
2
3    public int numOfStrings(String[] patterns, String word) {
4        int res = 0;
5        for (String pattern : patterns) {
6            if (check(pattern, word)) {
7                res++;
8            }
9        }
10        return res;
11    }
12
13    private boolean check(String pattern, String word) {
14        int m = pattern.length();
15        int n = word.length();
16        for (int i = 0; i + m <= n; i++) {
17            boolean flag = true;
18            for (int j = 0; j < m; j++) {
19                if (word.charAt(i + j) != pattern.charAt(j)) {
20                    flag = false;
21                    break;
22                }
23            }
24            if (flag) {
25                return true;
26            }
27        }
28        return false;
29    }
30}