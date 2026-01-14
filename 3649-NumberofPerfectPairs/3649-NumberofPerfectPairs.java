// Last updated: 1/14/2026, 8:48:24 PM
1class Solution {
2    public long perfectPairs(int[] nums) { 
3        long[] nums2=new long[nums.length];
4        for(int i=0;i<nums.length;i++){
5            nums2[i]=nums[i]<0? -(long)nums[i]:(long)nums[i];
6        }
7        Arrays.sort(nums2);
8        long c=0;
9        for(int i=0,j=0;i<nums.length;i++){
10            if(j<=i){
11                j=i+1;
12            }
13            while(j<nums.length && nums2[j]<=2L*nums2[i]){
14                j++;
15            }
16            c+=(j-i-1);
17        }
18        return c;
19    }
20}