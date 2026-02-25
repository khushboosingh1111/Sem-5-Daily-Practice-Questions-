// Last updated: 2/25/2026, 10:25:32 PM
1class Solution {
2    public boolean hasAllCodes(String s, int k) {
3        HashSet<String> set=new HashSet<>();
4        int n=s.length();
5        int c=1<<k; //pow(2,k)
6        for(int i=k;i<=n;i++){
7            String sub=s.substring(i-k,i);
8            if(!set.contains(sub)){
9                set.add(sub);
10                c--;
11            }
12            if(c==0){
13                return true;
14            }
15        }
16        return false;
17    }
18}