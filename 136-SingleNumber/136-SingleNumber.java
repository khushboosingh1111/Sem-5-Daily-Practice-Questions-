// Last updated: 8/6/2025, 10:16:23 AM
class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i : nums) ans^=i;
        return ans;
    }
}