// Last updated: 8/6/2025, 10:12:59 AM
class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n=arr.length;
        int [] lmax =new int[n];
        int [] rmin =new int[n+1];
        int ans=0;
        rmin[n]=Integer.MAX_VALUE;
        lmax[0]=arr[0];
        for(int i=1;i<n;i++){
            lmax[i]=Math.max(lmax[i-1],arr[i]);
        }
        for(int i=n-1;i>=0;i--){
            rmin[i]=Math.min(rmin[i+1],arr[i]);
        }
        for(int i=0;i<n;i++){
            if(lmax[i]<=rmin[i+1]){
                ans++;
            }
        }
        return ans;
    }
}