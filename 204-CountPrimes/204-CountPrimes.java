// Last updated: 2/27/2026, 10:05:37 PM
1class Solution {
2    public int countPrimes(int n) {
3        if(n<=2){
4            return 0;
5        }
6        return PrimeSieve(n);
7        
8    }
9    public static int PrimeSieve(int n) {
10		int [] ans=new int[n];
11		ans[0]=ans[1]=1;
12		for(int i=2;i*i<=ans.length;i++) {
13			if(ans[i]==0) { //i prime hai uske multiple ki jgh 1 rkh denge
14				for(int j=2;i*j<ans.length;j++) {
15					ans[i*j]=1;
16				}
17				
18			}
19		}
20		int c=0;
21		for(int i=2;i<ans.length;i++) {
22			if(ans[i]==0) {
23				c++;
24			}
25		}
26		return c;
27	}
28
29}