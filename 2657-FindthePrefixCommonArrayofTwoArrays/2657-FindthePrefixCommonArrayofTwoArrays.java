// Last updated: 5/20/2026, 6:13:40 PM
1class Solution {
2
3    public int[] findThePrefixCommonArray(int[] A, int[] B) {
4        int n = A.length;
5        int[] prefixCommonArray = new int[n];
6
7        // Initialize sets to store elements from A and B
8        Set<Integer> elementsInA = new HashSet<Integer>();
9        Set<Integer> elementsInB = new HashSet<Integer>();
10
11        // Iterate through the elements of both arrays
12        for (int currentIndex = 0; currentIndex < n; ++currentIndex) {
13            // Add current elements from A and B to respective sets
14            elementsInA.add(A[currentIndex]);
15            elementsInB.add(B[currentIndex]);
16
17            int commonCount = 0;
18
19            // Count common elements between the sets
20            for (int element : elementsInA) {
21                if (elementsInB.contains(element)) {
22                    ++commonCount;
23                }
24            }
25
26            // Store the count of common elements for the current prefix
27            prefixCommonArray[currentIndex] = commonCount;
28        }
29
30        // Return the final array with counts of common elements in each prefix
31        return prefixCommonArray;
32    }
33}