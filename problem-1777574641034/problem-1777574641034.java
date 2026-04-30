// Last updated: 5/1/2026, 12:14:01 AM
1class Solution {
2    public int findNonMinOrMax(int[] nums) {
3        int min=Integer.MAX_VALUE;
4        int max=Integer.MIN_VALUE;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]<min){
7                min=nums[i];
8            }
9            if(nums[i]>max){
10                max=nums[i];
11            }
12        }
13        int c=0;
14        for(int i=0;i<nums.length;i++){
15            if(nums[i]!=min && nums[i]!=max){
16                c++;
17                return nums[i];
18            }
19        }
20        if(c==0)return -1;
21        return c;
22    }
23}