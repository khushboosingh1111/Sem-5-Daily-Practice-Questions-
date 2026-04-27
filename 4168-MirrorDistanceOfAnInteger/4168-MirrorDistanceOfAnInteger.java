// Last updated: 4/27/2026, 10:50:25 PM
class Solution {
    public int mirrorDistance(int n) {
        int num=n;
        int rev=0;
        while(n > 0){
            int digit = n % 10;      
            rev = rev * 10 + digit;    
            n = n / 10;           
        }
        return Math.abs(num-rev);
    }
}