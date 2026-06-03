// Last updated: 6/3/2026, 10:52:01 PM
1class Solution {
2    private int solve(
3        int[] start1,
4        int[] duration1,
5        int[] start2,
6        int[] duration2
7    ) {
8        int finish1 = Integer.MAX_VALUE;
9        for (int i = 0; i < start1.length; i++) {
10            finish1 = Math.min(finish1, start1[i] + duration1[i]);
11        }
12        int finish2 = Integer.MAX_VALUE;
13        for (int i = 0; i < start2.length; i++) {
14            finish2 = Math.min(
15                finish2,
16                Math.max(start2[i], finish1) + duration2[i]
17            );
18        }
19        return finish2;
20    }
21    public int earliestFinishTime(
22        int[] landStartTime,
23        int[] landDuration,
24        int[] waterStartTime,
25        int[] waterDuration
26    ) {
27        int land_water = solve(
28            landStartTime,
29            landDuration,
30            waterStartTime,
31            waterDuration
32        );
33        int water_land = solve(
34            waterStartTime,
35            waterDuration,
36            landStartTime,
37            landDuration
38        );
39        return Math.min(land_water, water_land);
40    }
41}