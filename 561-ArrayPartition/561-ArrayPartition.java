// Last updated: 8/6/2025, 10:13:44 AM
class Solution {
    public int arrayPairSum(int[] nums) {
        int sum=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i+=2){
            sum+=nums[i];
        }
        
        return sum;
    }
}