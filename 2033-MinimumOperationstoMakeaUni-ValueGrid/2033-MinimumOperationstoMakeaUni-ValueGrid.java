// Last updated: 4/28/2026, 10:36:14 PM
1class Solution {
2    public int minOperations(int[][] grid, int x) {
3        // Create a list to store all the numbers from the grid
4        ArrayList<Integer> numsArray = new ArrayList<>();
5        int result = 0;
6        // Flatten the grid into numsArray
7        for (int row = 0; row < grid.length; row++) {
8            for (int col = 0; col < grid[0].length; col++) {
9                numsArray.add(grid[row][col]);
10            }
11        }
12        // Sort numsArray in non-decreasing order to easily find the median
13        Collections.sort(numsArray);
14        int length = numsArray.size();
15        // Store the median element as the final common value
16        int finalCommonNumber = numsArray.get(length / 2);
17        // Iterate through each number in numsArray
18        for (int number : numsArray) {
19            // If the remainder when divided by x is different, return -1
20            if (number % x != finalCommonNumber % x) {
21                return -1;
22            }
23            // Add the number of operations required to make the current number equal to finalCommonNumber
24            result += Math.abs(finalCommonNumber - number) / x;
25        }
26        return result;
27    }
28}