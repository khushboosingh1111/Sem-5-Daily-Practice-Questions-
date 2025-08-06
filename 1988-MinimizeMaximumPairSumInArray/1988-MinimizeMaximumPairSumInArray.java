// Last updated: 8/6/2025, 10:10:41 AM
class Solution {
    public int minPairSum(int[] nums) {
        int max=0,l=0,r=nums.length-1;
        Arrays.sort(nums);
        while(l<r){
            int p =nums[l]+nums[r];
            l++;
            r--;
            max=Math.max(p,max);
        }
        
        return max;
        
    }
}