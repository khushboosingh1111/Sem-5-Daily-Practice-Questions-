// Last updated: 3/16/2026, 4:13:36 PM
1class Solution {
2    public List<Integer> grayCode(int n) {
3        int size = 1 << n;  // 2^n
4        List<Integer> result = new ArrayList<>();
5        for (int i = 0; i < size; i++) {
6            result.add(i ^ (i >> 1)); 
7        }
8        return result;
9    }
10}