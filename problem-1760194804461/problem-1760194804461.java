// Last updated: 10/11/2025, 8:30:04 PM
class Solution {
    public boolean scoreBalance(String s) {
        int n=s.length();
        
        int[] parr=new int[n];
        parr[0]=s.charAt(0)-'a'+1;
        for(int i=1;i<n;i++){
            parr[i]=parr[i-1]+(s.charAt(i)-'a'+1);
            
        }
        int t=parr[n-1];
        for(int k=0;k<n-1;k++){
            int lsum=parr[k];
            int rsum=t-lsum;
            if(lsum==rsum){
                return true;
            }
        }
        return false;
        
    }
}