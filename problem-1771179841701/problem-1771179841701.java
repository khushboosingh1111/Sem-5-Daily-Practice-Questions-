// Last updated: 2/15/2026, 11:54:01 PM
1class Solution {
2    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
3        boolean[] on = new boolean[101]; 
4        for (int b : bulbs) {
5            on[b] = !on[b];
6        }
7        List<Integer> result = new ArrayList<>();
8        for (int i = 1; i <= 100; i++) {
9            if (on[i]) {
10                result.add(i);
11            }
12        }
13    
14        return result;
15    }
16}