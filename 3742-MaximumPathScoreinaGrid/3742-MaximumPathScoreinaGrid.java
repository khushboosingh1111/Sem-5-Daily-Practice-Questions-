// Last updated: 4/30/2026, 9:21:10 PM
1class Solution {
2    public int maxPathScore(int[][] grid, int k) {
3        int m=grid.length;
4        int n=grid[0].length;
5        boolean reach=true;
6        Integer[][][] l=new Integer[m][n][k+1];
7        
8        return Math.max(-1,Path(0,0,0,k,grid,l));
9        
10    }
11    private int Path(int i,int j,int cost,int k,int[][] grid,Integer[][][] l){
12        if(cost>k){
13            return Integer.MIN_VALUE;
14        }
15        if(l[i][j][cost]!=null){
16            return l[i][j][cost];
17        }
18        boolean reach=false;
19        int m=grid.length;
20        int n=grid[0].length;
21        int a=grid[i][j];
22        int b=Integer.MIN_VALUE;
23        int s;
24        if(a==2){
25            s=2;
26        }
27        else{
28            s=a;
29        }
30        int newc;
31        if(a==0){
32            newc=cost+0;
33        }
34        else{
35            newc=cost+1;
36        }
37        if(i==m-1 && j==n-1){
38            int q=Integer.MIN_VALUE;
39            if(newc<=k){
40                q=s;
41            }
42            l[i][j][cost]=q;
43            return q;
44            
45        }
46        if(i+1<m){
47            b=Math.max(b,Path(i+1,j,newc,k,grid,l));
48        }
49        if(j+1<n){
50            b=Math.max(b,Path(i,j+1,newc,k,grid,l));
51        }
52        int p;
53        if(b==Integer.MIN_VALUE){
54            p=Integer.MIN_VALUE;
55        }
56        else{
57            p=b+s;
58        }
59        l[i][j][cost]=p;
60        return p;
61        
62    }
63}