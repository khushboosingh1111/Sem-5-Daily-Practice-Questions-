// Last updated: 8/6/2025, 10:15:26 AM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        return Product(nums);
    }
    public static int[] Product(int[] arr) {
		int len=arr.length;
		int[] right=new int[len];
		int[] left=new int[len];
		left[0]=1;
		for(int i=1;i<len;i++) {
			left[i]=arr[i-1]*left[i-1];
		}
		right[len-1]=1;
		for(int i=len-2;i>=0;i--) {
			right[i]=right[i+1]*arr[i+1];
		}
		for(int i=0;i<len;i++) {
			left[i]=right[i]*left[i];
		}
		return left;
		
	}
}