// Last updated: 1/18/2026, 10:33:19 AM
1class Solution {
2    public int[] bestTower(int[][] towers, int[] center, int radius) {
3
4        int bestQuality = -1;
5        int bestX = -1, bestY = -1;
6
7        for (int[] t : towers) {
8            int x = t[0];
9            int y = t[1];
10            int q = t[2];
11
12            int dist = Math.abs(x - center[0]) + Math.abs(y - center[1]);
13
14            if (dist <= radius) {
15                //jiska jada quility ya quality equal hai aur lexicographically smaller hair to update krdo
16                if (q > bestQuality ||
17                   (q == bestQuality &&
18                   (x < bestX || (x == bestX && y < bestY)))) {
19
20                    bestQuality = q;
21                    bestX = x;
22                    bestY = y;
23                }
24            }
25        }
26        //best quality radius k andr nhi mili toh
27        if (bestQuality == -1) return new int[]{-1, -1};
28        return new int[]{bestX, bestY};
29    }
30}
31