// Last updated: 2/6/2026, 12:23:53 PM
1class Solution {
2    public long maximumTripletValue(int[] nums) {
3       return findTriplet(nums); 
4    }
5    public static long findTriplet(int[]arr) {
6		long maxTriplet = 0;
7		long dif = 0;
8		long leftMax = 0;
9		for (int i = 0; i < arr.length; i++) {
10			maxTriplet=Math.max(maxTriplet, dif*arr[i]);
11			dif = Math.max(dif, leftMax-arr[i]);
12			leftMax = Math.max(leftMax, arr[i]);
13		}
14		return maxTriplet;
15	}
16}