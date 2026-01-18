// Last updated: 1/18/2026, 10:41:29 AM
1class Solution {
2    public int[] bestTower(int[][] towers, int[] center, int radius) {
3        int bestQuality=-1;
4        int bestx=-1;
5        int besty=-1;
6        for(int[] t:towers){
7            int x=t[0];
8            int y=t[1];
9            int q=t[2];
10            int dis=Math.abs(x-center[0])+Math.abs(y-center[1]);
11            if(dis<=radius){
12                if(q>bestQuality || (q==bestQuality && (x<bestx || x==bestx && y<besty))){
13                    bestQuality=q;
14                    bestx=x;
15                    besty=y;
16                }
17            }
18        }
19        if(bestQuality==-1){
20            return new int[] {-1,-1};
21        }
22        return new int[]{bestx,besty};
23        
24    }
25}
26