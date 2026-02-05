// Last updated: 2/5/2026, 3:48:34 PM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        if ( strs.length == 0)
4           return "";
5        
6        Arrays.sort(strs);
7        String first = strs[0];
8        String last = strs[strs.length - 1];
9        int c = 0;
10        while(c < first.length())
11        {
12            if (first.charAt(c) == last.charAt(c))
13                c++;
14            else
15                break;
16        }
17        return c == 0 ? "" : first.substring(0, c);
18    
19    }
20}