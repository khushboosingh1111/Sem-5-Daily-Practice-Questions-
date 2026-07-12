// Last updated: 7/13/2026, 1:03:49 AM
1class Solution {
2
3    public int[] arrayRankTransform(int[] arr) {
4        // Store the rank for each number in arr
5        HashMap<Integer, Integer> numToRank = new HashMap<>();
6        int[] sortedArr = Arrays.copyOf(arr, arr.length);
7        Arrays.sort(sortedArr);
8        int rank = 1;
9        for (int i = 0; i < sortedArr.length; i++) {
10            if (i > 0 && sortedArr[i] > sortedArr[i - 1]) {
11                rank++;
12            }
13            numToRank.put(sortedArr[i], rank);
14        }
15        for (int i = 0; i < arr.length; i++) {
16            arr[i] = numToRank.get(arr[i]);
17        }
18        return arr;
19    }
20}