// Last updated: 8/6/2025, 10:12:01 AM
class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] degree=new int[n+1];
        for(int[] edge:trust){
            --degree[edge[0]];
            ++degree[edge[1]];
        }
        for(int node=1;node<=n;node++){
            if(degree[node]== n-1){
                return node;
            }
        }
        return -1;
    }
}