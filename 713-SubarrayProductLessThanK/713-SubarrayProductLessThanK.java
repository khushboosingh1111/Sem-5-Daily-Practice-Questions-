// Last updated: 8/6/2025, 10:13:09 AM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        return(Subarray_Product_Less_than_k(nums,k));
    }
    public static int Subarray_Product_Less_than_k(int[] nums,int k) {
		int ans=0;
		int si=0;
		int ei=0;
		int p=1;
		while(ei<nums.length) {
			//grow
			p=p*nums[ei];
			
			//Shrink
			while(p>=k && si<=ei) {
				p=p/nums[si];
				si++;
			}
			//ans update
			ans=ans+(ei-si)+1;
			ei++;
		}
		return ans;
	}
    
}