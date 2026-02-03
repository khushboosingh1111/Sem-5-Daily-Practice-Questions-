// Last updated: 2/3/2026, 3:55:50 PM
1class Solution {
2
3    public int minLength(String s) {
4        Stack<Character> st=new Stack<>();
5        for(int i=0;i<s.length();i++){
6            char ch=s.charAt(i);
7            if(st.isEmpty()){
8                st.push(s.charAt(i));
9                continue;
10            }
11            if(ch=='B' && st.peek()=='A'){
12                st.pop();
13            }
14            else if(ch=='D' && st.peek()=='C'){
15                st.pop();
16            }
17            else{
18                st.push(ch);
19            }
20
21        }
22        return st.size();
23    }
24}