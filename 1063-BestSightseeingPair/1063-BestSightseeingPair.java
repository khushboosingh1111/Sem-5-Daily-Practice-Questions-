// Last updated: 8/6/2025, 10:11:53 AM
class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int best=values[0],max=0;

        for(int i=1;i<values.length;i++){
            max=Math.max(max,values[i]+best-i);
            best=Math.max(best,values[i]+i);
        }
        return max;
    }
}