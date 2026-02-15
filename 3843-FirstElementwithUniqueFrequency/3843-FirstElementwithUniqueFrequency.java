// Last updated: 2/16/2026, 12:08:53 AM
1class Solution {
2    public int firstUniqueFreq(int[] A) {
3        Map<Integer, Integer> c1 = new HashMap<>();
4        for (int a : A){
5            c1.put(a, c1.getOrDefault(a, 0) + 1);
6        }
7        Map<Integer, Integer> c2 = new HashMap<>();
8        for (int f : c1.values()){
9            c2.put(f, c2.getOrDefault(f, 0) + 1);
10        }
11        for (int a : A){
12            if (c2.get(c1.get(a)) == 1){
13                return a;
14            }
15        }
16        return -1;
17    }
18}