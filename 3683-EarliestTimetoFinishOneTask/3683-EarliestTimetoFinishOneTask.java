// Last updated: 9/14/2025, 1:58:41 PM
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