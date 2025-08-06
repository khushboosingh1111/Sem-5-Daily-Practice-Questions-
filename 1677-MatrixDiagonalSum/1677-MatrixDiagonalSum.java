// Last updated: 8/6/2025, 10:11:01 AM
class Solution {
    public int diagonalSum(int[][] mat) {
        int i,n=mat.length,sum=0;
        for(i=0;i<n;i++){
            sum += mat[i][i];
            sum += mat[i][n-i-1];
        }
        if(n%2==1){
            int mid=n/2;
            sum=sum-mat[mid][mid];

        }
        return sum;
            
    }
}

