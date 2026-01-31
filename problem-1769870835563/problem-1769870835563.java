// Last updated: 1/31/2026, 8:17:15 PM
1class Solution {
2    public String reverseByType(String s) {
3        StringBuilder letter=new StringBuilder();
4        StringBuilder special=new StringBuilder();
5        StringBuilder ans=new StringBuilder();
6        int l=0;int sp=0;
7        for(char ch:s.toCharArray()){
8            if(ch>='a' && ch<='z'){
9                letter.append(ch);
10            }
11            else{
12                special.append(ch);
13            }
14        }
15        letter.reverse();
16        special.reverse();
17        for(char ch:s.toCharArray()){
18            if(ch>='a' && ch<='z'){
19                ans.append(letter.charAt(l++));
20            }
21            else{
22                ans.append(special.charAt(sp++));
23            }
24        }
25        return ans.toString();
26        
27    }
28}