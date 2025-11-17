// Last updated: 11/17/2025, 7:58:19 PM
class Solution {
    public long countDistinct(long n) {
        long ans = 0;
        String s = Long.toString(n);
        for (int i = 1; i < s.length(); i++) {
            ans += Math.pow(9, i);
        }
        int l = s.length();
        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length()) {
                ans++;
                break;
            }
            long val = s.charAt(i) - '0';
            if (val == 0) break;
            ans += (val - 1) * Math.pow(9, l - i - 1);
        }
        return ans;
    }
}