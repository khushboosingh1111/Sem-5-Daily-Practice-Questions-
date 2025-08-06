// Last updated: 8/6/2025, 10:16:11 AM
class Solution {
    public int findMin(int[] nums) {
        int a=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<a){
                a=nums[i];
            }
        }
        return a;
        
    }
}