// Last updated: 6/23/2026, 10:18:09 PM
1class Solution {
2    public int maxNumberOfBalloons(String text) {
3        int b_freq = 0;
4        int a_freq = 0;
5        int l_freq = 0;
6        int o_freq = 0;
7        int n_freq = 0;
8
9        for(char ch: text.toCharArray()) {
10            if(ch == 'b') b_freq++;
11            else if(ch == 'a') a_freq++;
12            else if(ch == 'l') l_freq++;
13            else if(ch == 'o') o_freq++;
14            else if(ch == 'n') n_freq++;
15        }
16        return Math.min(Math.min(b_freq, a_freq), Math.min(n_freq, Math.min(l_freq/2, o_freq/2)));
17    }
18}