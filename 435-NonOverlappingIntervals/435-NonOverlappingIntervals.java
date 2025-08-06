// Last updated: 8/6/2025, 10:14:26 AM
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        return nonOverlapping(intervals);
    }
   public static int nonOverlapping(int[][] arr) {
		int count=0;
		int sec = 0;
		
		Arrays.sort(arr,new Comparator<int []>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[1]-o2[1];
			}
		});
        int max = arr[arr.length-1][0];
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i][1]>max) {
				count++;
				max = Math.max(arr[i][0], max);
			}else {
				max = arr[i][0];
			}
		}
		return count;
		
	}
}