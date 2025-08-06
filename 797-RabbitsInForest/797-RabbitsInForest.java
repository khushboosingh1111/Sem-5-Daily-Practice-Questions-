// Last updated: 8/6/2025, 10:12:56 AM
class Solution {
    public int numRabbits(int[] nums) {
        int i;
        Arrays.sort(nums);
        int c=nums[0],t=c+1, n=nums.length;
        for(i=1;i<n;i++)
        {
            if(nums[i]==nums[i-1] && c>0)
            {
                c--; continue;
            }
            c=nums[i];
            t=t+c+1;
        }
        return t;
    }
}