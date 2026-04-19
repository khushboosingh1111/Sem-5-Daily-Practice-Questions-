// Last updated: 4/19/2026, 9:22:56 PM
1class Solution {
2    public int maxDistance(int[] A, int[] B) {
3        int i, j = 1;
4        for (i = 0; i < A.length && j < B.length; j++)
5            if (A[i] > B[j])
6                i++;
7
8        return j - i - 1;
9    }
10}