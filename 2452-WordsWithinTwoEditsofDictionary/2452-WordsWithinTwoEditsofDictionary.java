// Last updated: 4/27/2026, 11:47:00 PM
1class Solution {
2    public List<String> twoEditWords(String[] queries, String[] dictionary) {
3        List<String> list=new ArrayList<>();
4        for(String query:queries){
5            if(solve(query,dictionary)){
6                list.add(query);
7            }
8        }
9        return list;
10    }
11    private boolean solve(String query,String[] dictionary){
12        for(String dict:dictionary){
13            int k=0;
14            for(int i=0;i<dict.length();i++){
15                    if(dict.charAt(i)!=query.charAt(i)){
16                        k++;
17                        if(k>2)break;
18                        
19                    }
20                }
21                if(k<=2)return true;
22            
23        }
24        return false;
25    }
26    
27}