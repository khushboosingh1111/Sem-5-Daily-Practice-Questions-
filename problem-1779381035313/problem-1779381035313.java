// Last updated: 5/21/2026, 10:00:35 PM
1class Solution {
2    public int longestCommonPrefix(int[] arr1, int[] arr2) {
3        HashSet<Integer> arr1Prefixes = new HashSet<Integer>(); // Set to store all prefixes from arr1
4        // Step 1: Build all possible prefixes from arr1
5        for (int val : arr1) {
6            while (!arr1Prefixes.contains(val) && val > 0) {
7                // Insert current value as a prefix
8                arr1Prefixes.add(val);
9                // Generate the next shorter prefix by removing the last digit
10                val /= 10;
11            }
12        }
13
14        int longestPrefix = 0;
15
16        // Step 2: Check each number in arr2 for the longest matching prefix
17        for (int val : arr2) {
18            while (!arr1Prefixes.contains(val) && val > 0) {
19                // Reduce val by removing the last digit if not found in the prefix set
20                val /= 10;
21            }
22            if (val > 0) {
23                // Length of the matched prefix using log10 to determine the number of digits
24                longestPrefix = Math.max(
25                    longestPrefix,
26                    (int) Math.log10(val) + 1
27                );
28            }
29        }
30        return longestPrefix;
31    }
32}