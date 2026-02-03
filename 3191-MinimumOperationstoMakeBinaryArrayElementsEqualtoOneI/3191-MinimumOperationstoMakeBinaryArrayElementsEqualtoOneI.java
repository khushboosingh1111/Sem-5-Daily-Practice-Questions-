// Last updated: 2/3/2026, 2:28:57 PM
1class Solution {
2    public int minOperations(int[] nums) {
3        int c=0;
4        int n=nums.length;
5        for(int i=0;i<n-2;i++){
6            if(nums[i]==0){
7                nums[i]^=1;
8                nums[i+1]^=1;
9                nums[i+2]^=1;
10                c++;
11            }
12        }
13        if(nums[n-1]==0 || nums[n-2]==0){
14            return -1;
15        }
16        return c;
17    }
18}