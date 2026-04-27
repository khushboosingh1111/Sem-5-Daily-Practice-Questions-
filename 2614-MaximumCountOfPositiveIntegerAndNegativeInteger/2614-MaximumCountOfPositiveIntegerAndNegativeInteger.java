// Last updated: 4/27/2026, 10:52:32 PM
class Solution {
    public int maximumCount(int[] nums) {
        int count=0;
        int p=firstPos(nums);
        int n=firstZero(nums);
        int pc=nums.length-p;
        return Math.max(pc,n);

    }
    public int firstPos(int[]nums){
        int ans=nums.length;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>0){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    //pehla 0 hi neg count dega jha pehla 0 mila utne hi -ve
    public int firstZero(int[] nums){
        int low=0;
        int high=nums.length-1;
        int ans=nums.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=0){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}