// Last updated: 2/28/2026, 10:10:10 PM
1class Solution {
2    public int countPrimes(int n) {
3        if (n == 0) return 0;
4        if(n==2) return 0;
5        if(n==1) return 0;
6        boolean[] isPrime = new boolean[n];
7        Arrays.fill(isPrime, true);
8        int count = n/2;
9        isPrime[0] = false;
10        if (n > 1) isPrime[1] = false;
11        for (int i = 3; i*i < n; i+=2) {
12            if (isPrime[i]) {
13                int j = i * i;
14                while (j < n) {
15                    if(isPrime[j]){
16                        count--;
17                    }
18                    isPrime[j] = false;
19                    j+= i*2;
20                }
21            }
22        }
23        
24        return count;
25    }
26}