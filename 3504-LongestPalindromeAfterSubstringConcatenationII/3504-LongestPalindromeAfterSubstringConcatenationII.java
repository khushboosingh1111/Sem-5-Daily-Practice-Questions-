// Last updated: 2/7/2026, 11:18:13 PM
1class Solution {
2    public int longestPalindrome(String s, String t) {
3        t = new StringBuilder(t).reverse().toString(); 
4        int[] ss = lps(s), tt = lps(t);
5        int n = s.length(), m = t.length(), res = 0;
6        int[][] dp = new int[n+1][m+1];
7        for (int i = 0; i < n; ++i) {
8            for (int j = 0; j < m; ++j) {
9                int a = 0;
10                if (s.charAt(i) == t.charAt(j)) {
11                    dp[i+1][j+1] = dp[i][j]+1;
12                    a = 1;
13                }
14                res = Math.max(res, 2*dp[i+1][j+1] + Math.max(ss[i+a], tt[j+a]));
15            }
16        }
17        return res;
18    }
19    private int[] lps(String s) {
20        int n = s.length(), res[] = new int[n+1];
21        for (int i = 0; i < n; ++i) {
22            for (int j = n-1; j >= i && res[i] < 2; --j) {
23                if (isPalindrome(s, i, j)) {
24                    res[i] = j-i+1;
25                } else {
26                    res[i] = 1;
27                }
28            }
29        }
30        return res;
31    }
32    private boolean isPalindrome(String s, int i, int j) {
33        int left = i;
34        int right = j;
35        while (left < right) {
36            if (s.charAt(left) != s.charAt(right)) {
37                return false;
38            }
39            left++;
40            right--;
41        }
42        return true;
43    }
44}