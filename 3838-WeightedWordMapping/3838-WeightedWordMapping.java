// Last updated: 6/14/2026, 12:27:09 AM
1class Solution {
2    public String mapWordWeights(String[] words, int[] weights) {
3        StringBuilder ans = new StringBuilder(words.length);
4        for (String word : words) {
5            int s = 0;
6            for (int i = 0; i < word.length(); i++) {
7                s += weights[word.charAt(i) - 'a'];
8            }
9            ans.append((char) ('z' - (s % 26)));
10        }
11        return ans.toString();
12    }
13}