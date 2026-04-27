// Last updated: 4/27/2026, 10:51:03 PM
class Solution {
    public int earliestTime(int[][] tasks) {
        int erly=Integer.MAX_VALUE;
        for(int i=0;i<tasks.length;i++){
            int sum=tasks[i][0]+tasks[i][1];
            erly=Math.min(erly,sum);
            
        }
        return erly;
    }
}