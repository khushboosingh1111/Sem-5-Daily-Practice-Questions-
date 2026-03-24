// Last updated: 3/24/2026, 11:05:05 AM
1class Solution {
2
3    public int[][] constructProductMatrix(int[][] grid) {
4        final int MOD = 12345;
5        int n = grid.length;
6        int m = grid[0].length;
7        int[][] p = new int[n][m];
8        long suffix=1;
9        for(int i=n-1;i>=0;i--){
10            for(int j=m-1;j>=0;j--){
11                p[i][j]=(int)suffix;
12                suffix=(suffix*grid[i][j])%MOD;
13            }
14        }
15        long prefix=1;
16        for(int i=0;i<n;i++){
17            for(int j=0;j<m;j++){
18                p[i][j]=(int)(((long)p[i][j]*prefix)%MOD);
19                prefix=(prefix*grid[i][j])%MOD;
20            }
21        }
22        return p;
23    }
24}