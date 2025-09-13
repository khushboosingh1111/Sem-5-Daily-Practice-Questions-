// Last updated: 9/13/2025, 7:05:21 PM
class Solution {
    public int minOperations(int[] nums) {
        boolean alleq=true;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[0]){
                alleq=false;
                break;
            }
        }
        if (alleq) return 0;
        return 1;
    }
    
}