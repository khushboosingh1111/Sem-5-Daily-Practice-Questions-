// Last updated: 4/27/2026, 10:50:02 PM
class Solution {
    public int firstUniqueEven(int[] nums) {
        int[] freq = new int[101];
        for (int x : nums) if (x % 2 == 0) freq[x]++;
        for (int x : nums) if (x % 2 == 0 && freq[x] == 1) return x;
        return -1;
    }
}