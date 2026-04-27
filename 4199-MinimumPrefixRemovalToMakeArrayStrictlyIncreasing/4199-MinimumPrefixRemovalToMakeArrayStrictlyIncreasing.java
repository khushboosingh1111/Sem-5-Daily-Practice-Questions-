// Last updated: 4/27/2026, 10:50:12 PM
class Solution {
    public int minimumPrefixLength(int[] nums) {
        int n=nums.length;
        int idx=n-2;
        while(idx>=0 && nums[idx]<nums[idx+1]){
            idx--;
        }
        return idx+1;
    }
}