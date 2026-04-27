// Last updated: 4/27/2026, 10:50:45 PM
class Solution {
    public boolean completePrime(int num) {
        int n=num;
        String s=Integer.toString(num);
        int size=s.length();
        for(int i=1;i<=size;i++){
            int prefix=Integer.parseInt(s.substring(0,i));
            if(!isPrime(prefix)){
                return false;
            }
        }
        for(int i=0;i<size;i++){
            int suffix=Integer.parseInt(s.substring(i,size));
            if(!isPrime(suffix)){
                return false;
            }
        }
        return true;
    }
    private boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        if(n==2){
            return true;
        }
        if(n%2==0){
            return false;
        }
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}