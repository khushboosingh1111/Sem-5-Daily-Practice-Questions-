// Last updated: 3/24/2026, 11:08:40 AM
1class Solution {
2    public int[][] constructProductMatrix(int[][] g) {
3        int m= g.length;
4        int n =g[0].length;
5        int size =m*n;
6        int mod =12345;
7        int ans[] =new int[size];
8        long pre[]= new long[size];
9        long suf[]= new long[size];
10        pre[0]= g[0][0];
11        int idx=0;
12        for(int i=0;i<m;i++){
13            for(int j=0;j<n;j++){
14                ans[idx++] =g[i][j];
15            }
16        }
17        pre[0] =1;
18        for(int i=1;i<pre.length;i++){
19            pre[i] =(pre[i-1]*ans[i-1])%mod;
20        }
21        suf[suf.length-1]= 1;
22        for(int i=ans.length-2;i>=0;i--){
23            suf[i]= (ans[i+1]*suf[i+1])%mod;
24        }
25        idx=0;
26        for(int i=0;i<m;i++){
27            for(int j=0;j<n;j++){
28                g[i][j]=(int)(pre[idx]*suf[idx])%mod;
29                idx++;
30            }
31        }
32        return g;
33        
34    }
35}