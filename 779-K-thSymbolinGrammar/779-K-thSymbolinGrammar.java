// Last updated: 1/28/2026, 9:21:00 PM
1class Solution {
2    public int recursion(int n, int k) {
3        // First row will only have one symbol '0'.
4        if (n == 1) {
5            return 0;
6        }
7
8        int totalElements = (int) Math.pow(2, (n - 1));
9        int halfElements = totalElements / 2;
10
11        // If the target is present in the right half, we switch to the respective left half symbol.
12        if (k > halfElements) {
13            return 1 - recursion(n, k - halfElements);
14        }
15
16        // Otherwise, we switch to the previous row.
17        return recursion(n - 1, k);
18    }
19
20    public int kthGrammar(int n, int k) {
21        return recursion(n, k);
22    }
23}