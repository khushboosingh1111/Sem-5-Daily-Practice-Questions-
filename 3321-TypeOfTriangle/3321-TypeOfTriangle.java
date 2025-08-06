// Last updated: 8/6/2025, 10:09:45 AM
class Solution {
    public String triangleType(int[] nums) {
        // Arrays.sort(nums);
        if(nums[0]+nums[1]<=nums[2] || nums[1]+nums[2]<=nums[0] || nums[0]+nums[2]<=nums[1]) return "none";
        if(nums[0]==nums[1] && nums[0]==nums[2]){
            return "equilateral";
        }else if(nums[0]==nums[1] || nums[0]==nums[2] || nums[1]==nums[2]){
            return "isosceles";
        }else{
            return "scalene";

        }
    }
}