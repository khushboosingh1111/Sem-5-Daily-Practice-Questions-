// Last updated: 1/8/2026, 10:15:14 PM
1class Solution {
2    public String largestEven(String s) {
3        int idx = s.lastIndexOf('2');
4        if(idx!=-1) return s.substring(0,idx+1);
5        return "";
6    }
7}
8  