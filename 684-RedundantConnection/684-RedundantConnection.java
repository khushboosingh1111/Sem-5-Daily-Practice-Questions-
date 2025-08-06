// Last updated: 8/6/2025, 10:13:18 AM
class Solution {
    private int findRoot(int[] parent,int root){
        return parent[root]==root ? root:findRoot(parent,parent[root]);
    }
    private boolean join(int[] parent,int u,int v){
        int root1=findRoot(parent,u);
        int root2=findRoot(parent,v);
        parent[root1]=root2;
        return root1 != root2;
    }
    public int[] findRedundantConnection(int[][] edges) {
        int[] parent =new int[edges.length+1];
        for(int i=0;i<parent.length;i++){
            parent[i]=i;
        }
        for(int[] edge : edges){
            if(!join(parent,edge[0],edge[1])){
                return edge;
            }
        }
        return null;
        
    }
}