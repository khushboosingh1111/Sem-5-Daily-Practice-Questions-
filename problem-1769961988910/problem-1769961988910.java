// Last updated: 2/1/2026, 9:36:28 PM
1class Solution {
2    public int countMonobit(int n) {
3        int count = 1; // for 0
4        int k = 1;
5        while ((1 << k) - 1 <= n) { 
6            count++;
7            k++;
8        }
9
10        return count;
11    }
12}