// Last updated: 4/27/2026, 10:51:07 PM
class Solution {
    public int minOperations(String s) {
        int ans=0;
        int[]freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=1;i<26;i++){
            if(freq[i]!=0){
                ans++;
                freq[(i+1)%26]+=freq[i];
            }
        }
        return ans;
        
    }
}