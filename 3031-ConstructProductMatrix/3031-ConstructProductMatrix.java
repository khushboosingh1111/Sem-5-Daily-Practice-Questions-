// Last updated: 4/27/2026, 10:52:14 PM
class Solution {
    public int[][] constructProductMatrix(int[][] g) {
        int m= g.length;
        int n =g[0].length;
        int size =m*n;
        int mod =12345;
        int ans[] =new int[size];
        long pre[]= new long[size];
        long suf[]= new long[size];
        pre[0]= g[0][0];
        int idx=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[idx++] =g[i][j];
            }
        }
        pre[0] =1;
        for(int i=1;i<pre.length;i++){
            pre[i] =(pre[i-1]*ans[i-1])%mod;
        }
        suf[suf.length-1]= 1;
        for(int i=ans.length-2;i>=0;i--){
            suf[i]= (ans[i+1]*suf[i+1])%mod;
        }
        idx=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                g[i][j]=(int)(pre[idx]*suf[idx])%mod;
                idx++;
            }
        }
        return g;
        
    }
}