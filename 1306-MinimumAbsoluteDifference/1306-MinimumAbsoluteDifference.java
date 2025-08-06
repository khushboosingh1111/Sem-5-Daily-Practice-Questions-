// Last updated: 8/6/2025, 10:11:24 AM
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        return absolutedifference(arr);
    }
    public static List<List<Integer>> absolutedifference(int[] arr){
		List<List<Integer>> ab = new ArrayList<>();
		Arrays.sort(arr);
		int min_diff = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length-1; i++) {
			min_diff = Math.min(min_diff, arr[i+1]-arr[i]);
		}
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i+1]-arr[i]==min_diff) {
				ArrayList<Integer> temp = new ArrayList<>();
				temp.add(arr[i]);
				temp.add(arr[i+1]);
				ab.add(temp);
			}
		}
		return ab;
	}
}