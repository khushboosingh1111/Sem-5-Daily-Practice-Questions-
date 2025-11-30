// Last updated: 11/30/2025, 11:57:02 PM
1class Solution {
2    public int[] productExceptSelf(int[] arr) {
3       
4    // }
5    // public static int[] Product(int[] arr) {
6		int len=arr.length;
7		int[] right=new int[len];
8		int[] left=new int[len];
9		left[0]=1;
10		for(int i=1;i<len;i++) {
11			left[i]=arr[i-1]*left[i-1];
12		}
13		right[len-1]=1;
14		for(int i=len-2;i>=0;i--) {
15			right[i]=right[i+1]*arr[i+1];
16		}
17		for(int i=0;i<len;i++) {
18			left[i]=right[i]*left[i];
19		}
20		return left;
21       
22		
23	}
24}