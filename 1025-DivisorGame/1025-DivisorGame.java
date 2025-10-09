// Last updated: 10/9/2025, 3:43:47 PM
class Solution {
    public boolean divisorGame(int n) {
        if(n==2){
            return true;
        }
        if(n==1){
            return false;
        }
        // int[] dp=new int[n];
        // int s=n;
        // boolean f=true;
        // for(int i=1;i<n;i++){
        //     f=false;
        //     if(i<s && s%i==0){
        //         s=s-i;
        //         f=true;
        //     }
            
        // }
        return n%2==0;
    }
}