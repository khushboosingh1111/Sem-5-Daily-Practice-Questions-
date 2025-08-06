// Last updated: 8/6/2025, 10:10:03 AM
class Solution {
    public long coloredCells(int n) {
        long sum = 1;
        for(int i=0;i<n;i++){
            sum+=4*i;
        }
        return sum;
    }
}