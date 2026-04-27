// Last updated: 4/27/2026, 11:43:53 PM
1class Solution {
2    public List<String> twoEditWords(String[] queries, String[] dictionary) {
3        List<String> ans=new ArrayList<>();
4        for(String q:queries){
5            for(String d:dictionary){
6                int edit=0;
7                for(int i=0;i<q.length();i++){
8                    if(q.charAt(i)!=d.charAt(i)){
9                        edit++;
10                    }
11                }
12                if(edit<=2){
13                    ans.add(q);
14                    break;
15                }
16            }
17        }
18        return ans;
19    }
20}