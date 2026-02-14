// Last updated: 2/14/2026, 8:09:33 PM
1class Solution {
2    public String mapWordWeights(String[] words, int[] weights) {
3        StringBuilder ans=new StringBuilder();
4        for(String st:words){
5            int sum=0;
6            for(char ch:st.toCharArray()){
7                sum+=weights[ch-'a'];
8            }
9            int mod=sum%26;
10            char map=(char)('z'-mod);
11            ans.append(map);
12        }
13        return ans.toString();
14    }
15}