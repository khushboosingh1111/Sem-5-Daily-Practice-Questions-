// Last updated: 3/7/2026, 11:26:26 PM
1class Solution {
2    public int minFlips(String s) {
3        
4        int n = s.length();
5        s = s + s;
6
7        StringBuilder s1 = new StringBuilder();
8        StringBuilder s2 = new StringBuilder();
9
10        // create alternating patterns
11        for (int i = 0; i < 2 * n; i++) {
12            if (i % 2 == 0) {
13                s1.append('0');
14                s2.append('1');
15            } else {
16                s1.append('1');
17                s2.append('0');
18            }
19        }
20
21        int result = Integer.MAX_VALUE;
22        int flip1 = 0;
23        int flip2 = 0;
24
25        int i = 0, j = 0;
26
27        while (j < 2 * n) {
28
29            if (s.charAt(j) != s1.charAt(j)) flip1++;
30            if (s.charAt(j) != s2.charAt(j)) flip2++;
31
32            // shrink window
33            if (j - i + 1 > n) {
34
35                if (s.charAt(i) != s1.charAt(i)) flip1--;
36                if (s.charAt(i) != s2.charAt(i)) flip2--;
37
38                i++;
39            }
40
41            // window size == n
42            if (j - i + 1 == n) {
43                result = Math.min(result, Math.min(flip1, flip2));
44            }
45
46            j++;
47        }
48
49        return result;
50    }
51}