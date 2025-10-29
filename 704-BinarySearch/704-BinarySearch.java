// Last updated: 10/29/2025, 12:51:06 PM
class Solution {
    public int search(int[] nums, int target) {
        return BS(nums,target,0,nums.length-1);
    }
    public int BS(int[] nums,int target,int st,int end){
        if(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>=target){
                return BS(nums,target,st,mid-1);
            }
            else{
                return BS(nums,target,mid+1,end);
            }
        }
        return -1;
    }
}