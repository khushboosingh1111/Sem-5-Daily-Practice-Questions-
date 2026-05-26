// Last updated: 5/27/2026, 12:50:04 AM
1class Solution {
2    public int numberOfSpecialChars(String word) {
3        Set<Character> s = new HashSet<>();
4        for (char c : word.toCharArray()) {
5            s.add(c);
6        }
7        int ans = 0;
8        for (char c = 'a'; c <= 'z'; c++) {
9            if (s.contains(c) && s.contains((char) (c - 'a' + 'A'))) {
10                ans++;
11            }
12        }
13        return ans;
14    }
15}