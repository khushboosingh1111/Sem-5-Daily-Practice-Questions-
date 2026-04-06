// Last updated: 4/6/2026, 8:11:04 PM
1class Solution {
2    public boolean judgeCircle(String moves) {
3        int[] ch = new int[26];
4        for (char move : moves.toCharArray()){
5            ch[move - 'A']++;
6        }
7        return ch['U' - 'A'] == ch['D' - 'A'] && 
8                ch['L' - 'A'] == ch['R' - 'A'];
9    }
10}