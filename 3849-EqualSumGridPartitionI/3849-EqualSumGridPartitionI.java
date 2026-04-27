// Last updated: 4/27/2026, 10:51:29 PM
class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        long sum=0;
        for(int[] i:grid){
            for(int x:i){
                sum+=x;
            }
        }
        if(sum%2!=0){
            return false;
        }
        long total=sum/2;
        long sum1=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<m;j++){
                sum1+=grid[i][j];
            }
            if(sum1==total){
                return true;
            }
        }
        long sum2=0;
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                sum2+=grid[i][j];
            }
            if(sum2==total){
                return true;
            }
        }
        return false;
    }
}