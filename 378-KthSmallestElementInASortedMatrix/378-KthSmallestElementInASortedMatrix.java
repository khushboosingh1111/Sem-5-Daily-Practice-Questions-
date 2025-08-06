// Last updated: 8/6/2025, 10:14:48 AM
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length - 1;

        int min = matrix[0][0];
        int max = matrix[n][n];

        while(min < max){
            int mid = min + (max - min) / 2;
            if(check(matrix, mid, k)){
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        return min;
    }


    private boolean check(int[][] matrix, int mid, int k){
        int count = 0;
        int i = 0;
        int j = matrix.length - 1;

        while(i <= matrix.length - 1 && j >= 0){
            if(matrix[i][j] <= mid){
                count += j + 1;
                i++;
            } else {
                j--;
            }
        }
        return count >= k;
        
    }
}