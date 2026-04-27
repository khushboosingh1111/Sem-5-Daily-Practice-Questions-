// Last updated: 4/27/2026, 10:51:22 PM
class Solution {
    public long perfectPairs(int[] nums) { 
        long[] nums2=new long[nums.length];
        for(int i=0;i<nums.length;i++){
            nums2[i]=nums[i]<0? -(long)nums[i]:(long)nums[i];
        }
        Arrays.sort(nums2);
        long c=0;
        for(int i=0,j=0;i<nums.length;i++){
            if(j<=i){
                j=i+1;
            }
            while(j<nums.length && nums2[j]<=2L*nums2[i]){
                j++;
            }
            c+=(j-i-1);
        }
        return c;
    }
}