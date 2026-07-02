// Last updated: 7/2/2026, 8:57:00 PM
1class Solution {
2    public int numOfStrings(String[] patterns, String word) {
3        int n=patterns.length;
4        int count=0;
5        for(int i=0;i<n;i++)
6        {
7            if(word.contains(patterns[i]))
8            {
9                count++;
10            }
11        }
12        return count;
13    }
14}