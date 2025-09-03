// Last updated: 9/3/2025, 11:04:19 PM
class Solution {
    public int lengthOfLIS(int[] nums) {
        int max=0;
        int[] dp=new int[nums.length];

        for(int num:nums){
            int index=Arrays.binarySearch(dp,0,max,num);
            index=index<0 ? Math.abs(index)-1:index;
            dp[index]=num;
            if(index==max){
                ++max;
            }
        }
        return max;
        
    }
}