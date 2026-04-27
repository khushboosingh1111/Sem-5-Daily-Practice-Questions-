// Last updated: 4/27/2026, 10:51:09 PM
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