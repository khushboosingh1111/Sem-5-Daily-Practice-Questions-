// Last updated: 3/14/2026, 11:21:22 PM
1class Solution {
2    int count = 0;
3    String result = "";
4    public String getHappyString(int n, int k) {
5        StringBuilder sb = new StringBuilder();
6        dfs(sb, n, k);
7
8        return result;
9    }
10    private void dfs(StringBuilder sb, int n, int k) {
11
12        if (sb.length() == n) {
13            count++;
14
15            if (count == k) {
16                result = sb.toString();
17            }
18            return;
19        }
20
21        char[] chars = {'a', 'b', 'c'};
22
23        for (char c : chars) {
24
25            // avoid same adjacent characters
26            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c)
27                continue;
28
29            sb.append(c);                 // choose
30            dfs(sb, n, k);                // explore
31            sb.deleteCharAt(sb.length() - 1); // backtrack
32
33            if (!result.equals("")) return; // stop early if found
34        }
35    }
36}