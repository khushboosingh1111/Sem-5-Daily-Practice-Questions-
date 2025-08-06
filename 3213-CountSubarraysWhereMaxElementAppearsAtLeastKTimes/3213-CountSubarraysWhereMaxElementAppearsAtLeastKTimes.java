// Last updated: 8/6/2025, 10:09:49 AM
class Solution {
    public long countSubarrays(int[] nums, int k) {
        return countK(nums,k);
    }
    public static long countK(int[] arr, int k) {
		int count = 0;
		long ans = 0;
		int lo = 0;
		int max = 0;
		for(int x:arr) {
			max = Math.max(x, max);
		}
		for(int i=0;i<arr.length && lo<arr.length;i++) {
			if(arr[i]==max)count++;
			if(count>=k) {
				while(lo<=i && count>=k) {
					ans+=arr.length-i;
					if(arr[lo]==max)count--;
					lo++;
				}
			}
		}
		return ans;
	}
}