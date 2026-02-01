// Last updated: 2/1/2026, 10:23:03 PM
1class Solution {
2    public int finalElement(int[] nums) {
3       return (int)Math.max(nums[0],nums[nums.length-1]); 
4    }
5}