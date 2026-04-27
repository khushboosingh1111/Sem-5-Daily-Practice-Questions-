// Last updated: 4/27/2026, 10:50:16 PM
class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        int bestQuality=-1;
        int bestx=-1;
        int besty=-1;
        for(int[] t:towers){
            int x=t[0];
            int y=t[1];
            int q=t[2];
            int dis=Math.abs(x-center[0])+Math.abs(y-center[1]);
            if(dis<=radius){
                if(q>bestQuality || (q==bestQuality && (x<bestx || x==bestx && y<besty))){
                    bestQuality=q;
                    bestx=x;
                    besty=y;
                }
            }
        }
        if(bestQuality==-1){
            return new int[] {-1,-1};
        }
        return new int[]{bestx,besty};
        
    }
}
