// Last updated: 3/24/2026, 11:30:29 AM
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        Arrays.sort(g);
4        Arrays.sort(s);
5        int child=0;
6        int idx=0;
7        while(idx<s.length && child<g.length){
8            if(s[idx]>=g[child]){
9                child++;
10            }
11            idx++;
12        }
13        return child;
14    }
15}