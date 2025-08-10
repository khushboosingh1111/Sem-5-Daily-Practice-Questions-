// Last updated: 8/10/2025, 10:33:21 PM
class Solution {
    public boolean reorderedPowerOf2(int n) {
        String s = sortDigits(n);
        for (int i = 1; i <= 1_000_000_000; i <<= 1) {
            if (sortDigits(i).equals(s)) return true;
        }
        return false;
    }

    private String sortDigits(int x) {
        char[] digits = String.valueOf(x).toCharArray();
        Arrays.sort(digits);
        return new String(digits);
    }
}
