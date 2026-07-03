// Last updated: 7/3/2026, 9:13:20 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3         int left=0,max=0;
4        int [] arr=new int[256];
5        for(int right=0;right<s.length();right++){
6            char ch=s.charAt(right);
7            left=Math.max(left,arr[ch]);
8            max=Math.max(max,right-left+1);
9            arr[ch]=right+1;
10        }
11        return max;
12    }
13}