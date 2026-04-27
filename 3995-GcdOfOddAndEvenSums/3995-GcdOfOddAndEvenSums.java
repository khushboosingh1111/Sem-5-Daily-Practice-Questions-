// Last updated: 4/27/2026, 10:51:12 PM
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int so=0;
        int se=0;
        for(int i=0;i<=2*n;i++){
            if(i%2==0){
                se+=i;
            }
            else{
                so+=i;
            }
        }
        return GCD(se,so);
    }
    public int GCD(int se,int so){
        while(so!=0){
            int t=so;
            so=se%so;
            se=t;
        }
        return se;
    }
}