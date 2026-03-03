// Last updated: 3/3/2026, 11:00:03 PM
1class Solution {
2
3    public char findKthBit(int n, int k) {
4        // Base case: for S1, return '0'
5        if (n == 1) return '0';
6
7        // Calculate the length of Sn
8        int len = 1 << n; // Equivalent to 2^n
9
10        // If k is in the first half of the string, recurse with n-1
11        if (k < len / 2) {
12            return findKthBit(n - 1, k);
13        }
14        // If k is exactly in the middle, return '1'
15        else if (k == len / 2) {
16            return '1';
17        }
18        // If k is in the second half of the string
19        else {
20            // Find the corresponding bit in the first half and invert it
21            char correspondingBit = findKthBit(n - 1, len - k);
22            return (correspondingBit == '0') ? '1' : '0';
23        }
24    }
25}