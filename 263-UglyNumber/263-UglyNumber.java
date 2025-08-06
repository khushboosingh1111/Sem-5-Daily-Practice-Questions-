// Last updated: 8/6/2025, 10:15:19 AM
class Solution {
    public boolean isUgly(int n) {
       if(n<=0){
            return false;
        }
        else{
             while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }
        }
        return n == 1;
    }
}