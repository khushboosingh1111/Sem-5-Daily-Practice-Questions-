// Last updated: 8/6/2025, 10:12:10 AM
class Solution {
    public int subarraysDivByK(int[] arr, int n) {
        return (int)Count_SubArray(arr,n);

    }
    public static long Count_SubArray(int [] arr,int k) {
		int n=arr.length;
		long[] freq=new long[k];
		long sum=0;
		freq[0]=1;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			int rem=(int)(sum%k);
			if(rem<0) {
				rem+=k;//-ve
			}
			freq[rem]++;
		}
		long ans=0;
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>=2) {
				long x=freq[i];
				ans+=(x*(x-1))/2;
			}
		}
		return ans;
	}

}