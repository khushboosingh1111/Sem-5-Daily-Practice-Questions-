// Last updated: 1/26/2026, 10:56:46 PM
1class Solution {
2    public List<String> generateParenthesis(int n) {
3        List<String> ll=new ArrayList<>();
4        solve(ll,n,0,0,"");
5        return ll;
6    }
7    public static void solve(List<String> ll,int n,int open,int close,String ans){
8        if(open==close && open==n && close==n){
9            ll.add(ans);
10            return;
11        }
12        if(open>n){
13            return;
14        }
15        if(close>open){
16            return;
17        }
18        solve(ll,n,open+1,close,ans+"(");
19        solve(ll,n,open,close+1,ans+")");
20
21    }
22}