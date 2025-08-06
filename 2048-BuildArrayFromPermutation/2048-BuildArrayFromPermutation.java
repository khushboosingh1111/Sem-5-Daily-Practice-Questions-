// Last updated: 8/6/2025, 10:10:36 AM
class Solution {
    public int[] buildArray(int[] nums) {
       int[] arr=new int[nums.length];
       for(int i=0;i<nums.length;i++){
        arr[i]=nums[nums[i]];
       }
       return arr;
    }
}
 