// Last updated: 1/25/2026, 8:15:11 AM
1class Solution {
2    public int minimumPrefixLength(int[] nums) {
3        int n=nums.length;
4        int idx=n-2;
5        while(idx>=0 && nums[idx]<nums[idx+1]){
6            idx--;
7        }
8        return idx+1;
9    }
10}