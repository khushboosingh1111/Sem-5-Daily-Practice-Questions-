// Last updated: 2/2/2026, 10:57:03 AM
1class Solution {
2    public int minNumberOperations(int[] target) {
3        final int n = target.length;
4        int result = 0, prev = 0;
5
6        for(final int curr : target) {
7            if(curr > prev)
8                result += curr - prev;
9
10            prev = curr; 
11        }
12
13        return result;
14    }
15}