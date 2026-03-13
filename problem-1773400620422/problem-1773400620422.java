// Last updated: 3/13/2026, 4:47:00 PM
1class Solution {
2    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
3
4        int max = 0;
5        for (int x : workerTimes) 
6            max = Math.max(max, x);
7
8        int h = (mountainHeight-1) / workerTimes.length + 1;
9        long left = 1, right = (long) max * h * (h + 1) / 2;
10        
11        while (left <= right) {
12            long mid = left + (right - left) / 2;
13            if (check(mountainHeight, workerTimes, mid)) right = mid - 1;
14            else left = mid + 1;
15        }
16        return left;
17    }
18
19    boolean check(int mountainHeight, int[] workerTimes, long time) {
20        for (int x : workerTimes) {
21            mountainHeight -= (int)(-1 + Math.sqrt(1 + 8 * time / x)) / 2;
22            if (mountainHeight <= 0) return true;
23        }
24        return false;
25    }
26}