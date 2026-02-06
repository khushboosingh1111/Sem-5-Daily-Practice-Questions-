// Last updated: 2/6/2026, 12:35:18 PM
1class Solution {
2    public long maximumTripletValue(int[] nums) {
3        long maxTriplet=0;
4        long diff=0;
5        int leftmax=0;
6        for(int i=0;i<nums.length;i++){
7            maxTriplet=Math.max(maxTriplet,diff*nums[i]);
8            diff=Math.max(diff,leftmax-nums[i]);
9            leftmax=Math.max(leftmax,nums[i]);
10        }
11        return maxTriplet;
12    }
13}