// Last updated: 8/6/2025, 10:14:53 AM
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int total = 10;
        int curr = 9; 
        int avai = 9; 
        
        for (int i = 2; i <= n && avai > 0; i++) {
            curr *= avai; 
            total += curr; 
            avai--;
        }
        
        return total;
    }
   
}