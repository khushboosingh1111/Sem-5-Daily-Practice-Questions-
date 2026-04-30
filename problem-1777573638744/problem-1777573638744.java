// Last updated: 4/30/2026, 11:57:18 PM
1class Solution {
2    public boolean checkXMatrix(int[][] grid) {
3        int n=grid.length;
4        int m=grid[0].length;
5        for(int i=0;i<n;i++){
6            for(int j=0;j<m;j++){
7                if(i==j || i+j==n-1){
8                    if(grid[i][j]==0){
9                        return false;
10                    }
11                }
12                else{
13                    if(grid[i][j]!=0){
14                        return false;
15                    }
16                }
17            }
18        }
19        return true;
20    }
21}