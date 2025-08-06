// Last updated: 8/6/2025, 10:09:30 AM
class Solution {
    public int minimumOperations(int[] nums) {
        return distinctArray(nums);
    }
    public static int distinctArray(int[] arr) {
		int[] freq = new int[100+1];
		
		int last = -1;
		for (int i = 0; i < arr.length; i++) {
			freq[arr[i]]+=1;
		}
		for(int i=0;i<arr.length;i++) {
			freq[arr[i]]--;
			if(freq[arr[i]]==1) {
				last = i;
			}
		}
		int ans = Math.ceilDiv(last+1, 3);
		return ans;
	}
}