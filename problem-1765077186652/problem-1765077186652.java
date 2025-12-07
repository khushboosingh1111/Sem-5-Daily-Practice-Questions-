// Last updated: 12/7/2025, 8:43:06 AM
1class Solution {
2    public int largestPrime(int n) {
3        if(n==2){
4            return 2;
5        }
6        if(n<2){
7            return 0;
8        }
9        int l=n;
10        int s=0;
11        int a=0;
12        boolean[] p=new boolean[n+1];
13        Arrays.fill(p,true);
14        for(int i=2;i*i<=n;i++){
15            if(p[i]){
16                for(int j=i*i;j<=n;j+=i){
17                    p[j]=false;
18                }
19            }
20        }
21        for(int k=2;k<=l;k++){
22            if(p[k]){
23                s+=k;
24                if(s>l){
25                    break;
26                }
27                if(p[s]){
28                    a=s;
29                }
30            }
31        }
32        return a;
33    }
34}