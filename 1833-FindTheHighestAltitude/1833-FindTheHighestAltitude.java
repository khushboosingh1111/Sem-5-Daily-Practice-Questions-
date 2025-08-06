// Last updated: 8/6/2025, 10:10:49 AM
class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length,max=0,sum=0;
        for(int i=0;i<n;i++){
            sum+=gain[i];
            max=Math.max(max,sum);
        }
        return max;
    }
}