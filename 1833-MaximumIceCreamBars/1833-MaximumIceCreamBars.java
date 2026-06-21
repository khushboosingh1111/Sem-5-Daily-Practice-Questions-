// Last updated: 6/21/2026, 11:10:02 PM
1class Solution {
2    public int maxIceCream(int[] costs, int coins) {
3
4        final int MAX_COST = 100000;
5
6        int[] freq = new int[MAX_COST + 1];
7
8        for (int cost : costs) {
9            freq[cost]++;
10        }
11
12        int answer = 0;
13
14        for (int cost = 1; cost <= MAX_COST; cost++) {
15
16            if (freq[cost] == 0) {
17                continue;
18            }
19
20            int canBuy = Math.min(freq[cost], coins / cost);
21
22            answer += canBuy;
23
24            coins -= canBuy * cost;
25        }
26
27        return answer;
28    }
29}