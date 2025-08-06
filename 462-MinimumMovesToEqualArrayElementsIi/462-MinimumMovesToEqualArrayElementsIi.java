// Last updated: 8/6/2025, 10:14:07 AM
class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums[(nums.length)/2];
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<n)sum+=n-nums[i];
            else sum+= nums[i]-n;
        }
        return sum;

        
    }
}