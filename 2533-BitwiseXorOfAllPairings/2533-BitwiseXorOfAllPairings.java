// Last updated: 4/27/2026, 10:52:37 PM
class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n=nums1.length;
		int m=nums2.length;
		if(n%2==0 & m%2==0) {
			return 0;
		}
		int xor1=Bitwise_XOR(nums1);
		int xor2=Bitwise_XOR(nums2);
		if(n%2==1 & m%2==1) {
			return xor1^xor2;
		}
		else if(n%2==1) { //odd vale array ka even pair hoga inka xor 0 ho jayega
			return xor2; //isliye yha se even vala return kra hai kyuki inka odd pair hoga
		}
		else {
			return xor1;
		}
	}
	public static int Bitwise_XOR(int[] arr) {
		int xor=0;
        for(int v:arr) {
        	xor^=v;
        }
        return xor;
	}

}