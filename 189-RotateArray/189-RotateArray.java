// Last updated: 3/18/2026, 9:54:41 PM
1class Solution {
2    public void rotate(int[] nums, int k) {
3        k=k%nums.length;
4        reverse(nums,0,nums.length-1);
5        reverse(nums,0,k-1);
6        reverse(nums,k,nums.length-1);
7    }
8    public static void reverse(int[] nums,int l,int r){
9        while(l<r){
10            int temp=nums[l];
11            nums[l]=nums[r];
12            nums[r]=temp;
13            l++;
14            r--;
15        }
16    }
17}