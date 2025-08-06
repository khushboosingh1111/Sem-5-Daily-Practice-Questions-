// Last updated: 8/6/2025, 10:09:35 AM
class Solution {
    public boolean canAliceWin(int n) {
        if(n<10){
            return false;
        }
        if(n<19){
            return true;
        }
        
        for(int i=10;i>0;i--){
            if(i%2==0){
                if(i>n){
                   return false;
                }
                else{
                  n=n-i;   
                }
            }
            else{
                if(i>n){
                    return true;
                }
                else{
                 n=n-i;   
                }
            }
            
        }
        return true;
        
    }
}