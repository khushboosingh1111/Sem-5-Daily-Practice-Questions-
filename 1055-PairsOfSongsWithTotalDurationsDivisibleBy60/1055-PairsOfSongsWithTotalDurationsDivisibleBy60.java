// Last updated: 8/6/2025, 10:11:55 AM
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] count=new int[60];
        int ans=0;
        for(int t:time){
            t%=60;
            ans+=count[(60-t)%60];
            count[t]++;
        }
        return ans;
    }
}