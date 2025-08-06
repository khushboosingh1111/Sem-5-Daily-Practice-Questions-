// Last updated: 8/6/2025, 10:11:13 AM
class Solution {
    public int[] finalPrices(int[] prices) {
      int n = prices.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (prices[j] <= prices[i]) {
                    prices[i] -= prices[j];
                    break;
                }
            }
        }
        return prices;   
    }
}