// Last updated: 7/8/2026, 10:00:52 PM
1class Solution {
2    public int[] sumAndMultiply(String s, int[][] queries) {
3        long MOD = 1_000_000_007;
4        int len = s.length();
5        long[] preSum = new long[len + 1];
6        long[] preProduct = new long[len + 1];
7        int[] nonZeroCnt = new int[len + 1];
8        long[] p10 = new long[len + 1];
9        p10[0] = 1;
10        for (int i = 0; i < len; i++) {
11            p10[i + 1] = (p10[i] * 10) % MOD;
12            int digit = s.charAt(i) - '0';
13            preSum[i + 1] = preSum[i] + digit;
14            if (digit == 0) {
15                preProduct[i + 1] = preProduct[i];
16                nonZeroCnt[i + 1] = nonZeroCnt[i];
17            } else {
18                preProduct[i + 1] = (preProduct[i] * 10 + digit) % MOD;
19                nonZeroCnt[i + 1] = nonZeroCnt[i] + 1;
20            }
21        }
22        int[] res = new int[queries.length];
23        for (int i = 0; i < queries.length; i++) {
24            int start = queries[i][0];
25            int end = queries[i][1];
26            long sum = preSum[end + 1] - preSum[start];
27            int cnt = nonZeroCnt[end + 1] - nonZeroCnt[start];
28            long subtract = (preProduct[start] * p10[cnt]) % MOD;
29            long x = (preProduct[end + 1] - subtract + MOD) % MOD;
30            res[i] = (int) ((x * sum) % MOD);
31        }
32        return res;
33    }
34}