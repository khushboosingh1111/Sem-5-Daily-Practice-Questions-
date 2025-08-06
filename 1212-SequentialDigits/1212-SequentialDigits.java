// Last updated: 8/6/2025, 10:11:35 AM
class Solution {
    public List<Integer> sequentialDigits(int low, int hi) {
        List<Integer> ll = new ArrayList<>();
		print(low,hi,ll,1,0);
        Collections.sort(ll);
        return ll;
    }
    public static void print(int low, int hi, List<Integer> ll, int idx, int ans) {
		if(ans>hi) {
			return;
		}
		if(ans>=low && ans<=hi) {
			ll.add(ans);
		}
		for(int i = idx;i<=9;i++) {	
			if(ans%10==i-1||ans==0) {
				print(low,hi,ll,i+1,ans*10+i);
			}
			else {
				return;
			}				
		}
		
	}
}