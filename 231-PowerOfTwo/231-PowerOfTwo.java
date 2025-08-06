// Last updated: 8/6/2025, 10:15:32 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
       return isPower(n); 
    }
    public static boolean isPower(int n) {
        if(n<=0)return false;
		while(n>1) {
			if(n%2!=0)return false;
			n=n/2;
		}
		return true;
	}
}