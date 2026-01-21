// Last updated: 1/21/2026, 12:13:54 PM
1class Solution {
2    public int getXORSum(int[] arr1, int[] arr2) {
3       int xor1=Bitwise_XOR(arr1);
4		int xor2=Bitwise_XOR(arr2);
5		return xor1&xor2;
6
7	}
8	public static int Bitwise_XOR(int[] arr) {
9		int xor=0;
10        for(int v:arr) {
11        	xor^=v; //xor=xor^v;
12        }
13        return xor;
14	}
15
16
17}
18