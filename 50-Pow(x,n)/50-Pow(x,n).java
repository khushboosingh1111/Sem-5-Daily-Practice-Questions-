// Last updated: 12/23/2025, 2:12:15 PM
1class Solution {
2    public double myPow(double x, int n) {
3        // Handle the case when n is 0
4        if (n == 0) {
5            return 1.0;
6        } // Return 1 if exponent is 0
7
8        // Convert n to long to handle Integer.MIN_VALUE
9        long N = n;
10        // Store n as long to avoid overflow
11
12        // If n is negative, invert x and make N positive
13        if (N < 0) {
14            x = 1 / x;
15            N = -N;
16        } // Invert base and exponent if n is negative
17
18        double result = 1.0;
19        // Initialize result
20
21        // Exponentiation by squaring
22        while (N > 0) {
23            if ((N % 2) == 1) {
24                result *= x;
25            } // Multiply result by x if N is odd
26            x *= x;
27            // Square the base
28            N /= 2;
29            // Halve the exponent
30        }
31        return result;
32        // Return the final result
33    }
34}