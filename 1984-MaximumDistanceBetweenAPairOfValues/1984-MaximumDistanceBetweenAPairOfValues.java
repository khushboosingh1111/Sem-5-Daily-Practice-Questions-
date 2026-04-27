// Last updated: 4/27/2026, 10:53:09 PM
class Solution {
    public int maxDistance(int[] A, int[] B) {
        int i, j = 1;
        for (i = 0; i < A.length && j < B.length; j++)
            if (A[i] > B[j])
                i++;

        return j - i - 1;
    }
}