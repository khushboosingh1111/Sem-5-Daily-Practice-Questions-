// Last updated: 6/2/2026, 11:20:35 PM
1class Solution {
2    public int earliestFinishTime(
3        int[] landStartTime,
4        int[] landDuration,
5        int[] waterStartTime,
6        int[] waterDuration
7    ) {
8        int n = landStartTime.length;
9        int m = waterStartTime.length;
10        int res = Integer.MAX_VALUE;
11        for (int i = 0; i < n; i++) {
12            for (int j = 0; j < m; j++) {
13                int land = landStartTime[i] + landDuration[i];
14                int land_water =
15                    Math.max(land, waterStartTime[j]) + waterDuration[j];
16                res = Math.min(res, land_water);
17
18                int water = waterStartTime[j] + waterDuration[j];
19                int water_land =
20                    Math.max(water, landStartTime[i]) + landDuration[i];
21                res = Math.min(res, water_land);
22            }
23        }
24        return res;
25    }
26}