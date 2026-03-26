// Last updated: 3/26/2026, 9:46:07 PM
1class Solution {
2    public boolean canPartitionGrid(int[][] grid) {
3        int n=grid.length;
4        int m=grid[0].length;
5        long sum=0;
6        for(int[] i:grid){
7            for(int x:i){
8                sum+=x;
9            }
10        }
11        if(sum%2!=0){
12            return false;
13        }
14        long total=sum/2;
15        long sum1=0;
16        for(int i=0;i<n-1;i++){
17            for(int j=0;j<m;j++){
18                sum1+=grid[i][j];
19            }
20            if(sum1==total){
21                return true;
22            }
23        }
24        long sum2=0;
25        for(int j=0;j<m;j++){
26            for(int i=0;i<n;i++){
27                sum2+=grid[i][j];
28            }
29            if(sum2==total){
30                return true;
31            }
32        }
33        return false;
34    }
35}