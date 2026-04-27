// Last updated: 4/27/2026, 10:51:06 PM
class Solution {
    public int longestSubarray(int[] nums) {
        if(nums.length<3){
            return nums.length;
        }
        int ans=0;
        int best=2;
        int current=2;
        for(int i=2;i<nums.length;i++){
            if(nums[i]==nums[i-1]+nums[i-2]){
                current++;
            }
            else{
                current=2;
            }
            if(current>best){
                best=current;
            }
        }
        return best;
        
    }
}