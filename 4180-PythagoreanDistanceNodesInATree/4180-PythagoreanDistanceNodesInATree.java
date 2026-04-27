// Last updated: 4/27/2026, 10:50:18 PM
class Solution {
    public int specialNodes(int n, int[][] edges, int x, int y, int z) {
        int[][] arr=edges;
        List<Integer>[] ll=new ArrayList[n];
        for(int i=0;i<n;i++){
            ll[i]=new ArrayList<>();
        }
        for(int[] e:arr){
            ll[e[0]].add(e[1]);
            ll[e[1]].add(e[0]);
        }
        int[]dx=bfs(x,ll,n);
        int[] dy=bfs(y,ll,n);
        int[] dz=bfs(z,ll,n);
        int co=0;
        for(int i=0;i<n;i++){
            int a=dx[i];
            int b=dy[i];
            int c=dz[i];
            int[] nums={a,b,c};
            Arrays.sort(nums);
            long lhs=(long)nums[0]*nums[0]+(long)nums[1]*nums[1];
            long rhs=(long)nums[2]*nums[2];
            if(lhs==rhs){
                co++;
            }
        }
        return co;
        
    }
    private int[] bfs(int start,List<Integer>[] ll,int n){
        int[] dist=new int[n];
        Arrays.fill(dist,-1);
        Queue<Integer> q=new ArrayDeque<>();
        q.offer(start);
        dist[start]=0;
        while(!q.isEmpty()){
            int nn=q.poll();
            for(int i:ll[nn]){
                if(dist[i]==-1){
                    dist[i]=dist[nn]+1;
                    q.offer(i);
                }
            }
        }
        return dist;
            
    }
}