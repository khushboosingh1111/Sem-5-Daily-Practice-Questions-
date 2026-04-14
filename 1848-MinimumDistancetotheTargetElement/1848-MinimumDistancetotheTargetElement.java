// Last updated: 4/14/2026, 8:22:47 PM
1class Solution {
2    public int getMinDistance(int[] nums, int target, int start) {
3        int min=Integer.MAX_VALUE;
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]==target){
6                int k=(Math.abs(i-start));
7            if(min>k){
8                min=k;
9            }
10            }
11        }
12        return min;
13    }
14}