// Last updated: 10/25/2025, 8:07:00 PM
class Solution {
    public int kthGrammar(int n, int k) {
        if(n==1){
            return 0;
        }
        int mid= 1 << (n - 2); //equals to (2^n-1/2) i.e len/2
        if(k<=mid){
            return kthGrammar(n-1,k);
        }
        else{
            return 1-kthGrammar(n-1,k-mid);
        }
        
    }
}