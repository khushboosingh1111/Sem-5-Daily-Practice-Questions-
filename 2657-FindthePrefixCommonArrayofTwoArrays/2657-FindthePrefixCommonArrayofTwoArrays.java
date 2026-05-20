// Last updated: 5/20/2026, 6:14:17 PM
1class Solution {
2    public int[] findThePrefixCommonArray(int[] A, int[] B) {
3        int[] ans = new int[A.length];
4        int[] freq = new int[A.length + 1];
5        int common = 0;
6        for(int i = 0; i < A.length; i++){
7            freq[A[i]]++;
8            if(freq[A[i]] == 2){
9                common++;
10            }
11            freq[B[i]]++;
12            if(freq[B[i]] == 2){
13                common++;
14            }
15            ans[i] = common;
16        }
17        return ans;
18    }
19}