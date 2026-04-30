// Last updated: 5/1/2026, 12:11:59 AM
1class Solution {
2    public int findNonMinOrMax(int[] nums) {
3        Arrays.sort(nums);
4        int n=nums.length;
5        if(n==2 || n==1){
6            return -1;
7        }
8        return nums[n/2];
9    }
10}