// Last updated: 6/8/2026, 9:06:21 PM
1class Solution {
2    public int[] pivotArray(int[] nums, int pivot) {
3        int[] res = new int[nums.length];
4        int equal = 0;
5        int max = 0;
6        for(int x:nums){
7            if(x==pivot)equal++;
8            else if(x>pivot)max++;
9        }
10        int small = 0;
11        equal = nums.length-equal-max;
12        max = nums.length-max;
13        for(int i=0;i<nums.length;i++){
14            if(nums[i]<pivot){
15                res[small] = nums[i];
16                small++;
17            }else if(nums[i]==pivot){
18                res[equal]=nums[i];
19                equal++;
20            }else{
21                res[max] = nums[i];
22                max++;
23            }
24        }
25        return res;
26    }
27}