// Last updated: 10/16/2025, 11:46:22 AM
class Solution{
		public boolean isBipartite(int[][] graph) {
			Queue<BipartitePair> q=new LinkedList<>();
			HashMap<Integer,Integer> visited=new HashMap<>();
			for(int i=0;i<graph.length;i++) { //isse sare vertex mil jayenge
				if(visited.containsKey(i)) { //already visited ko skip/ignore krenge
					continue;
				}
				q.add(new BipartitePair(i,0)); //nhi toh new pair add kro queue m
				while(!q.isEmpty()) {
					//1.remove
					BipartitePair rp=q.poll();
					//2.Ignore if already visited
					if(visited.containsKey(rp.vtx)) {
						if(visited.get(rp.vtx)!=rp.dis) {
							return false;
						}
						continue;
					}
					//3.marked visited
					visited.put(rp.vtx,rp.dis);
					//4.self work
					//5.Add unvisited
					for(int nbrs:graph[rp.vtx]) {
						if(!visited.containsKey(nbrs)) {
							q.add(new BipartitePair(nbrs,rp.dis+1));
						}
					}
				}
			}
			return true;
			
		}
	}
	class BipartitePair{
		int vtx;
		int dis;
		public BipartitePair(int vtx,int dis) {
			this.vtx=vtx;
			this.dis=dis;
		}
	}