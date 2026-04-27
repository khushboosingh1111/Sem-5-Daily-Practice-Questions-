// Last updated: 4/27/2026, 10:50:06 PM
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans=new StringBuilder();
        for(String st:words){
            int sum=0;
            for(char ch:st.toCharArray()){
                sum+=weights[ch-'a'];
            }
            int mod=sum%26;
            char map=(char)('z'-mod);
            ans.append(map);
        }
        return ans.toString();
    }
}