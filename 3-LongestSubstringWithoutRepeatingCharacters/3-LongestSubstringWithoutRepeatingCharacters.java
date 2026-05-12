// Last updated: 5/12/2026, 9:18:26 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int end=s.length(),maxlen=0;
4        int[] arr=new int[128];
5        for(int i=0,j=0;i<end;i++){
6            int a=s.charAt(i);
7            j=Math.max(j,arr[a]);
8            maxlen=Math.max(maxlen,i-j+1);
9            arr[a]=i+1;
10        }
11        return maxlen;
12        
13    }
14}