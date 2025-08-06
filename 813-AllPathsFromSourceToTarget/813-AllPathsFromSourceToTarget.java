// Last updated: 8/6/2025, 10:12:50 AM
class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>current=new ArrayList<>();
        current.add(0);
        dfs(0,graph,current,graph.length-1,ans);
        return ans;
        
    }
    private void dfs(int src,int[][]graph,List<Integer>current,int dest,List<List<Integer>>ans){
        if(src==dest){
            ans.add(new ArrayList(current));
            return;
        }
        for(int n:graph[src]){
            current.add(n);
            dfs(n,graph,current,dest,ans);
            current.remove(current.size()-1);
        }
    }
}