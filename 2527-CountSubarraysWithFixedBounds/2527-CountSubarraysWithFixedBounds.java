// Last updated: 8/6/2025, 10:10:08 AM
class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        return count(nums,minK,maxK);
    }
    public static long count(int[] arr, int mink, int maxk) {
		int min = -1;
		int max = -1;
		int invalid = -1;
		long count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == mink) {
				min = i;
			}
			if (arr[i] == maxk) {
				max = i;
			}
			if(arr[i]<mink || arr[i]>maxk) {
				invalid = i;
			}
			if(min>-1 && max>-1) {
				count+=Math.max(Math.min(min, max)-invalid, 0);				
			}
			
		}
		return count;

	}
}