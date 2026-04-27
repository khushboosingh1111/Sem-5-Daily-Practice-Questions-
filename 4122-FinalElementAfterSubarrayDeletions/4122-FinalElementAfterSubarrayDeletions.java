// Last updated: 4/27/2026, 10:50:38 PM
class Solution {
    public int finalElement(int[] nums) {
       return (int)Math.max(nums[0],nums[nums.length-1]); 
    }
}