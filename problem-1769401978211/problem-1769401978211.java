// Last updated: 1/26/2026, 10:02:58 AM
1class Solution {
2    public List<List<Integer>> minimumAbsDifference(int[] arr) {
3        return absolutedifference(arr);
4    }
5    public static List<List<Integer>> absolutedifference(int[] arr){
6		List<List<Integer>> ab = new ArrayList<>();
7		Arrays.sort(arr);
8		int min_diff = Integer.MAX_VALUE;
9		for (int i = 0; i < arr.length-1; i++) {
10			min_diff = Math.min(min_diff, arr[i+1]-arr[i]);
11		}
12		for (int i = 0; i < arr.length-1; i++) {
13			if(arr[i+1]-arr[i]==min_diff) {
14				ArrayList<Integer> temp = new ArrayList<>();
15				temp.add(arr[i]);
16				temp.add(arr[i+1]);
17				ab.add(temp);
18			}
19		}
20		return ab;
21	}
22}