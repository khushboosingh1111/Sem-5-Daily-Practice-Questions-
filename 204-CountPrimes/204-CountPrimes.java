// Last updated: 2/28/2026, 8:25:57 PM
1class Solution {
2    public int countPrimes(int n) {
3        if (n == 0) return 0;
4        boolean[] isPrime = new boolean[n];
5        Arrays.fill(isPrime, true);
6        int count = 0;
7        isPrime[0] = false;
8        if (n > 1) isPrime[1] = false;
9        for (int i = 0; i < n; i++) {
10            if (isPrime[i]) {
11                count++;
12                int j = i * 2;
13                while (j < n) {
14                    isPrime[j] = false;
15                    j = j + i;
16                }
17            }
18        }
19        
20        return count;
21    }
22}