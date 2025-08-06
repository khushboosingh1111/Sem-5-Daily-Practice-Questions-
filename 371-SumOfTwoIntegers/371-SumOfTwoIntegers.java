// Last updated: 8/6/2025, 10:14:50 AM
class Solution {
    public int getSum(int a, int b) {
        while(b!=0){
            int c = a&b;
            a^=b;
            b = c<<1;
        }
        return a; 
    }
}