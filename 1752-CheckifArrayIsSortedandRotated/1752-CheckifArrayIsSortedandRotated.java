// Last updated: 3/17/2026, 11:49:19 AM
1class Solution {
2
3    public boolean check(int[] nums) {
4        int size = nums.length;
5
6        // Create a sorted copy of the array
7        int[] sortedNums = nums.clone();
8        Arrays.sort(sortedNums);
9
10        // Compare the original array with the sorted array, considering all possible rotations
11        for (int i = 0; i < size; i++) {
12            boolean isMatch = true;
13            for (int j = 0; j < size; j++) {
14                if (
15                    nums[(i + j) % size] != sortedNums[j]
16                ) {
17                    isMatch = false;
18                    break;
19                }
20            }
21            if (isMatch) {
22                return true;
23            }
24        }
25
26        return false;
27    }
28}