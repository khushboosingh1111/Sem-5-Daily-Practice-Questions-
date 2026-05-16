// Last updated: 5/16/2026, 11:54:01 PM
1class Solution {
2    public int findMin(int[] nums) {
3        int a=nums[0];
4        for(int i=1;i<nums.length;i++){
5            if(nums[i]<a){
6                a=nums[i];
7            }
8        }
9        return a;
10    }
11}