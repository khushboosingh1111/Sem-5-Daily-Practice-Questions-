// Last updated: 3/1/2026, 11:18:41 PM
1class Solution {
2    public String trimTrailingVowels(String s) {
3        int i = s.length() - 1;
4        while (i >= 0 && 
5              "aeiou".indexOf(s.charAt(i)) != -1) {
6            i--;
7        }
8        
9        return s.substring(0, i + 1);
10    }
11}