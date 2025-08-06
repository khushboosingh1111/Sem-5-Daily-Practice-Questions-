// Last updated: 8/6/2025, 10:09:25 AM
class Solution {
    public int countPartitions(int[] nums) {
        int s=0;
        int lsum=0;
        int c=0;
        for(int k:nums){
            s+=k;
        }
        for(int i=0;i<nums.length-1;i++){
            lsum+=nums[i];
            int rsum=s-lsum;
            if((lsum-rsum)%2==0){
                c++;
            }
        }
        return c;
    }
}