// Last updated: 11/18/2025, 10:35:48 PM
class Solution {
    public int minMoves(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
        }
        int sum=0;
        for(int a:nums){
            sum+=a-max;
        }
        return Math.abs(sum);
    }
}