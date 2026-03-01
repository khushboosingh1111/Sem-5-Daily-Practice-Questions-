// Last updated: 3/1/2026, 11:11:00 PM
1class Solution {
2    public int minPartitions(String n) {
3        for(int i=9;i>0;i--)
4        {
5            if(n.contains(i+""))
6            return i;
7        }
8        return 0;
9    }
10}