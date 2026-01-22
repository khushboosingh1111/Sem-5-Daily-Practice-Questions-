// Last updated: 1/22/2026, 11:05:56 PM
1class Solution {
2    public int maximizeWin(int[] prizePositions, int k) {
3        int n = prizePositions.length;
4        int[] cover = new int[n];
5        int[] next = new int[n];
6
7        // Step 1: Two pointers
8        int right = 0;
9        for (int left = 0; left < n; left++) {
10            while (right < n && prizePositions[right] <= prizePositions[left] + k) {
11                right++;
12            }
13            cover[left] = right - left;
14            next[left] = right;
15        }
16
17        // Step 2: Suffix maximum
18        int[] best = new int[n + 1];
19        best[n] = 0;
20        for (int i = n - 1; i >= 0; i--) {
21            best[i] = Math.max(best[i + 1], cover[i]);
22        }
23
24        // Step 3: Combine two segments
25        int ans = 0;
26        for (int i = 0; i < n; i++) {
27            ans = Math.max(ans, cover[i] + best[next[i]]);
28        }
29
30        return ans;
31    }
32}