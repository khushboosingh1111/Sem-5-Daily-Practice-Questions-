// Last updated: 3/18/2026, 9:53:44 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int n = nums.length;
4        int [] temp = new int[n];
5        int idx =0;
6        for(int i =0; i < n; i++){
7            if(nums[i] != 0){
8                temp[idx++] = nums[i];
9            }
10        } 
11        for(int i =0; i < n; i++){
12            nums[i] = temp[i];
13        }
14    }
15}