// Last updated: 4/27/2026, 10:51:48 PM
1class Solution {
2    int startInd = 0, endInd = 0;
3    public String longestPalindrome(String s) {
4        char[] charArray = s.toCharArray();
5        backtrack(charArray,0);
6        return s.substring(startInd,endInd+1);
7    }
8    public void backtrack(char[] charArray, int i){
9        if(i> charArray.length-1) return;
10        int left= i, right=i;
11        //ssss
12        while(right< charArray.length-1 && charArray[right] == charArray[right+1]) right++;
13        i = right;
14        while(left>0 && right< charArray.length-1 && charArray[left-1] == charArray[right+1]){
15            left--;
16            right++;
17        }
18        if(right-left>endInd - startInd){
19            startInd = left;
20            endInd = right;
21        }
22
23        backtrack(charArray, ++i);
24    }
25}