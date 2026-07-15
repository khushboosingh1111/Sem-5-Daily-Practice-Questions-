// Last updated: 7/15/2026, 9:58:35 PM
1class Solution {
2    public int gcdOfOddEvenSums(int n) {
3        int so=0;
4        int se=0;
5        for(int i=0;i<=2*n;i++){
6            if(i%2==0){
7                se+=i;
8            }
9            else{
10                so+=i;
11            }
12        }
13        return GCD(se,so);
14    }
15    public int GCD(int se,int so){
16        while(so!=0){
17            int t=so;
18            so=se%so;
19            se=t;
20        }
21        return se;
22    }
23}