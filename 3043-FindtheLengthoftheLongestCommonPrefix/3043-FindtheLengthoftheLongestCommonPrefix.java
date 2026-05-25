// Last updated: 5/25/2026, 10:51:55 PM
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
13        int longestPrefix = 0;
14        // Step 2: Check each number in arr2 for the longest matching prefix
15        for (int val : arr2) {
16            while (!arr1Prefixes.contains(val) && val > 0) {
17                // Reduce val by removing the last digit if not found in the prefix set
18                val /= 10;
19            }
20            if (val > 0) {
21                // Length of the matched prefix using log10 to determine the number of digits
22                longestPrefix = Math.max(
23                    longestPrefix,
24                    (int) Math.log10(val) + 1
25                );
26            }
27        }
28        return longestPrefix;
29    }
30}