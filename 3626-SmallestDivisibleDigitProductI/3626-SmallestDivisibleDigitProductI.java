// Last updated: 8/6/2025, 10:09:34 AM
class Solution {
    public int smallestNumber(int n, int t) {
    int current = n;
        while (true) {
            int product = digitProduct(current);
            if (product % t == 0) { 
                return current;
            }
            current++;
        }
    }
    private int digitProduct(int num) {
        int product = 1;
        while (num > 0) {
            int digit = num % 10;
            product *= digit;
            num /= 10;
        }
        return product;
    }

    
}