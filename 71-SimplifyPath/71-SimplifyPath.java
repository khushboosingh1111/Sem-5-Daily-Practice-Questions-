// Last updated: 5/2/2026, 1:08:05 PM
1class Solution {
2    public String simplifyPath(String path) {
3        String[] parts=path.split("/");
4        Stack<String> st=new Stack<>();
5        for(String part:parts){
6            if(part.equals("") || part.equals(".")){
7                continue;
8            }
9            else if(part.equals("..")){
10                if(!st.isEmpty()){
11                    st.pop();
12                }
13            }
14            else{
15                st.push(part);
16            }
17        }
18        StringBuilder ans=new StringBuilder();
19        for(String s:st){
20            ans.append("/").append(s);
21        }
22        if(ans.length()==0){
23            return "/";
24        }
25        return ans.toString();
26    }
27}