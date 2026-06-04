// Last updated: 6/4/2026, 11:34:41 PM
1class Solution {
2
3    public int totalWaviness(int num1, int num2) {
4        int total = 0;
5        for (int i = num1; i <= num2; i++) {
6            total += getWaviness(i);
7        }
8        return total;
9    }
10
11    private int getWaviness(int x) {
12        String s = Integer.toString(x);
13        int waviness = 0;
14
15        for (int i = 1; i < s.length() - 1; i++) {
16            boolean isPeak =
17                s.charAt(i) > s.charAt(i - 1) && s.charAt(i) > s.charAt(i + 1);
18            boolean isValley =
19                s.charAt(i) < s.charAt(i - 1) && s.charAt(i) < s.charAt(i + 1);
20            if (isPeak || isValley) {
21                waviness++;
22            }
23        }
24
25        return waviness;
26    }
27}