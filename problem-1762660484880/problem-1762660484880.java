// Last updated: 11/9/2025, 9:24:44 AM
class Solution {
    public int maxPathScore(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        boolean reach=true;
        Integer[][][] l=new Integer[m][n][k+1];
        
        return Math.max(-1,Path(0,0,0,k,grid,l));
        
    }
    private int Path(int i,int j,int cost,int k,int[][] grid,Integer[][][] l){
        if(cost>k){
            return Integer.MIN_VALUE;
        }
        if(l[i][j][cost]!=null){
            return l[i][j][cost];
        }
        boolean reach=false;
        int m=grid.length;
        int n=grid[0].length;
        int a=grid[i][j];
        int b=Integer.MIN_VALUE;
        int s;
        if(a==2){
            s=2;
        }
        else{
            s=a;
        }
        int newc;
        if(a==0){
            newc=cost+0;
        }
        else{
            newc=cost+1;
        }
        if(i==m-1 && j==n-1){
            int q=Integer.MIN_VALUE;
            if(newc<=k){
                q=s;
            }
            l[i][j][cost]=q;
            return q;
            
        }
        if(i+1<m){
            b=Math.max(b,Path(i+1,j,newc,k,grid,l));
        }
        if(j+1<n){
            b=Math.max(b,Path(i,j+1,newc,k,grid,l));
        }
        int p;
        if(b==Integer.MIN_VALUE){
            p=Integer.MIN_VALUE;
        }
        else{
            p=b+s;
        }
        l[i][j][cost]=p;
        return p;
        
    }
}