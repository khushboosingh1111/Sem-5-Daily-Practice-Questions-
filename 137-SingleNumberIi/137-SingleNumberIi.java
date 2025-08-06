// Last updated: 8/6/2025, 10:16:21 AM
class Solution {
    public int singleNumber(int[] nums) {
        int one = 0, two = 0;
        for(int i : nums){
            one = (one ^ i) & ~two;
            two = (two ^ i) & ~one;
        }
        return one;
    }
}