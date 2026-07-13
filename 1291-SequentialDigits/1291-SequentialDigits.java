// Last updated: 7/13/2026, 9:37:43 AM
1class Solution {
2    public List<Integer> sequentialDigits(int low, int high) {
3        List<Integer> ans = new ArrayList<>();
4        String s = "123456789";
5        String l = String.valueOf(low);
6        String h = String.valueOf(high);
7        for (int len = l.length(); len <= h.length(); len++) {
8            for (int start = 0; start <= 9 - len; start++) {
9                int num = Integer.parseInt(s.substring(start, start + len));
10                if (num >= low && num <= high) {
11                    ans.add(num);
12                }
13            }
14        }
15
16        return ans;
17    }
18}