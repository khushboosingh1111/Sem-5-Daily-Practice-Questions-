// Last updated: 1/25/2026, 9:15:10 AM
1class Solution {
2    public int specialNodes(int n, int[][] edges, int x, int y, int z) {
3        int[][] arr=edges;
4        List<Integer>[] ll=new ArrayList[n];
5        for(int i=0;i<n;i++){
6            ll[i]=new ArrayList<>();
7        }
8        for(int[] e:arr){
9            ll[e[0]].add(e[1]);
10            ll[e[1]].add(e[0]);
11        }
12        int[]dx=bfs(x,ll,n);
13        int[] dy=bfs(y,ll,n);
14        int[] dz=bfs(z,ll,n);
15        int co=0;
16        for(int i=0;i<n;i++){
17            int a=dx[i];
18            int b=dy[i];
19            int c=dz[i];
20            int[] nums={a,b,c};
21            Arrays.sort(nums);
22            long lhs=(long)nums[0]*nums[0]+(long)nums[1]*nums[1];
23            long rhs=(long)nums[2]*nums[2];
24            if(lhs==rhs){
25                co++;
26            }
27        }
28        return co;
29        
30    }
31    private int[] bfs(int start,List<Integer>[] ll,int n){
32        int[] dist=new int[n];
33        Arrays.fill(dist,-1);
34        Queue<Integer> q=new ArrayDeque<>();
35        q.offer(start);
36        dist[start]=0;
37        while(!q.isEmpty()){
38            int nn=q.poll();
39            for(int i:ll[nn]){
40                if(dist[i]==-1){
41                    dist[i]=dist[nn]+1;
42                    q.offer(i);
43                }
44            }
45        }
46        return dist;
47            
48    }
49}