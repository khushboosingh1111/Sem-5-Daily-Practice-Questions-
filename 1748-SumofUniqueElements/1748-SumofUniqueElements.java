// Last updated: 11/21/2025, 2:56:19 PM
class Solution {
    public int countGoodSubstrings(String s) {
        int c=0;
      for(int i=2;i<s.length();i++){
        if(s.charAt(i)!=s.charAt(i-1) && s.charAt(i)!=s.charAt(i-2) && s.charAt(i-1)!=s.charAt(i-2)){
            c++;
        }
      }  
      return c;
    }
}