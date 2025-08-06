// Last updated: 8/6/2025, 10:14:41 AM
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0,n=s.length(),m=t.length();
        while(i<n && j<m){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            
                
            }
            j++;
            
        }
        return i==n;
        
    }
}