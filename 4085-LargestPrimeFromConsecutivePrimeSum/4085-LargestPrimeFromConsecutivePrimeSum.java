// Last updated: 4/27/2026, 10:50:51 PM
class Solution {
    public int largestPrime(int n) {
        if(n==2){
            return 2;
        }
        if(n<2){
            return 0;
        }
        int l=n;
        int s=0;
        int a=0;
        boolean[] p=new boolean[n+1];
        Arrays.fill(p,true);
        for(int i=2;i*i<=n;i++){
            if(p[i]){
                for(int j=i*i;j<=n;j+=i){
                    p[j]=false;
                }
            }
        }
        for(int k=2;k<=l;k++){
            if(p[k]){
                s+=k;
                if(s>l){
                    break;
                }
                if(p[s]){
                    a=s;
                }
            }
        }
        return a;
    }
}