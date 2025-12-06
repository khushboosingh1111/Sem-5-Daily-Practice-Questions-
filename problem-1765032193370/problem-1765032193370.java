// Last updated: 12/6/2025, 8:13:13 PM
1class Solution {
2    public boolean completePrime(int num) {
3        int n=num;
4        String s=Integer.toString(num);
5        int size=s.length();
6        for(int i=1;i<=size;i++){
7            int prefix=Integer.parseInt(s.substring(0,i));
8            if(!isPrime(prefix)){
9                return false;
10            }
11        }
12        for(int i=0;i<size;i++){
13            int suffix=Integer.parseInt(s.substring(i,size));
14            if(!isPrime(suffix)){
15                return false;
16            }
17        }
18        return true;
19    }
20    private boolean isPrime(int n){
21        if(n<=1){
22            return false;
23        }
24        if(n==2){
25            return true;
26        }
27        if(n%2==0){
28            return false;
29        }
30        for(int i=3;i*i<=n;i+=2){
31            if(n%i==0){
32                return false;
33            }
34        }
35        return true;
36    }
37}