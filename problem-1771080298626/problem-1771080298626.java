// Last updated: 2/14/2026, 8:14:58 PM
1class Solution {
2    public int prefixConnected(String[] words, int k) {
3        String[] st=words;
4        HashMap<String,Integer> map=new HashMap<>();
5        int grp=0;
6        for(String str:st){
7            if(str.length()<k){
8                continue;
9            }
10            String pre=str.substring(0,k);
11            map.put(pre,map.getOrDefault(pre,0)+1);
12        }
13        for(int cnt:map.values()){
14            if(cnt>=2){
15                grp++;
16            }
17        }
18        return grp;
19    }
20}