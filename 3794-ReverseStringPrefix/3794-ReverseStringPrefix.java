// Last updated: 1/10/2026, 7:47:13 PM
1class Solution {
2    public String reversePrefix(String s, int k) {
3        char[] temp = s.toCharArray();
4        StringBuilder sb = new StringBuilder();
5        for(int i = k - 1; i >= 0; i--){
6            sb.append(temp[i]);
7        }    
8        for(int i = k; i < temp.length; i++){
9            sb.append(temp[i]);
10        }
11        return sb.toString();
12        
13    }
14}