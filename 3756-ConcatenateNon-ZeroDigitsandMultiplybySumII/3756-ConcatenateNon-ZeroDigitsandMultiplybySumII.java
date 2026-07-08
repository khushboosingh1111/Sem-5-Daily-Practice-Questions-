// Last updated: 7/8/2026, 9:03:42 PM
1class Solution {
2    private static final int MOD = 1000000007;
3    private static final int MAX_N = 100001;
4    private static final long[] pow10 = new long[MAX_N];
5    // static runs only once for all test cases
6    static {
7        pow10[0] = 1;
8        for (int i = 1; i < MAX_N; ++i) {
9            pow10[i] = (pow10[i - 1] * 10) % MOD;
10        }
11    }
12
13    public int[] sumAndMultiply(String s, int[][] queries) {
14        int n = s.length();
15        int[] sum = new int[n + 1];
16        long[] x = new long[n + 1];
17        int[] cnt = new int[n + 1];
18        for (int i = 0; i < n; ++i) {
19            int d = s.charAt(i) - '0';
20            sum[i + 1] = sum[i] + d;
21            x[i + 1] = d > 0 ? (x[i] * 10 + d) % MOD : x[i];
22            cnt[i + 1] = cnt[i] + (d > 0 ? 1 : 0);
23        }
24        int m = queries.length;
25        int[] res = new int[m];
26        for (int i = 0; i < m; ++i) {
27            int l = queries[i][0];
28            int r = queries[i][1] + 1;
29            int length = cnt[r] - cnt[l];
30            long val_x = (x[r] - ((x[l] * pow10[length]) % MOD) + MOD) % MOD;
31            long val_sum = sum[r] - sum[l];
32            res[i] = (int) ((val_x * val_sum) % MOD);
33        }
34        return res;
35    }
36}