// Last updated: 2/3/2026, 11:08:37 AM
1class Solution {
2    public String makeGood(String s) {
3        Stack<Character> st=new Stack<>();
4        StringBuilder str=new StringBuilder();
5        for(char ch:s.toCharArray()){
6            if(!st.isEmpty() && Math.abs(ch-st.peek())==32){
7                st.pop();
8            }
9            else{
10                st.push(ch);
11            }  
12        }
13        while(!st.isEmpty()){
14            str.insert(0,st.pop());
15        }
16        return str.toString();
17        
18    }
19}