// Last updated: 8/6/2025, 10:13:36 AM
class Solution {
    public int triangleNumber(int[] nums) {
        return ValidTriangle(nums);
    }
    public static int ValidTriangle(int[]arr) {
		int count = 0;
		Arrays.sort(arr);
		for(int k=2;k<arr.length;k++) {
			int i=0, j=k-1;
			while(i<j) {
				if(arr[i]+arr[j]>arr[k]) {
					count+=j-i;
					j--;
				}else {
					i++;
				}
			}
		}
		return count;
		
	}
}