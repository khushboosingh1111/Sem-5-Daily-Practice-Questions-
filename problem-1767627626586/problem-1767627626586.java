// Last updated: 1/5/2026, 9:10:26 PM
1class Solution {
2    public int sumFourDivisors(int[] nums) {
3        int totalSum = 0;
4
5        for (int n : nums) {
6            int sum = 0;
7            int count = 0;
8
9            for (int i = 1; i * i <= n; i++) {
10                if (n % i == 0) {
11                    int d1 = i;
12                    int d2 = n / i;
13
14                    sum += d1;
15                    count++;
16
17                    if (d1 != d2) {
18                        sum += d2;
19                        count++;
20                    }
21
22                    if (count > 4) break; 
23                }
24            }
25
26            if (count == 4) {
27                totalSum += sum;
28            }
29        }
30
31        return totalSum;
32    }
33}