// Last updated: 3/19/2026, 11:21:41 PM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int one=0;
4        int ans=0;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]==1){
7                one++;
8                ans=Math.max(ans,one);
9            }
10            else{
11                one=0;
12            }
13        }
14        return ans;
15    }
16}