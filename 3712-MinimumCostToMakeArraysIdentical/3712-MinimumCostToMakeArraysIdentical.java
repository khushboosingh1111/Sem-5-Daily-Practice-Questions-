// Last updated: 8/6/2025, 10:09:16 AM
class Solution {
    public long minCost(int[] arr, int[] brr, long k) {
        long cost=0,cost2=0;
        int n=arr.length;
        
        for(int i=0; i<n; i++){
            cost2 += Math.abs(arr[i]-brr[i]);
        }
        Arrays.sort(arr);
        Arrays.sort(brr);
        for(int i=0; i<n; i++){
            cost += Math.abs(arr[i]-brr[i]);
        }
        return Math.min(cost2,cost+k);
        
    }
}