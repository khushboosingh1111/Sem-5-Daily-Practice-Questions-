// Last updated: 4/27/2026, 10:53:10 PM
class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
       int xor1=Bitwise_XOR(arr1);
		int xor2=Bitwise_XOR(arr2);
		return xor1&xor2;

	}
	public static int Bitwise_XOR(int[] arr) {
		int xor=0;
        for(int v:arr) {
        	xor^=v; //xor=xor^v;
        }
        return xor;
	}


}
