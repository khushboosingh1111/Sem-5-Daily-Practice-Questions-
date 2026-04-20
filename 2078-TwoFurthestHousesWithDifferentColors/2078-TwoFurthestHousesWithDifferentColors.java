// Last updated: 4/20/2026, 9:53:29 PM
1class Solution {
2    public int maxDistance(int[] colors) {
3       int dis = 0;
4       int n = colors.length;
5       for(int i=0;i<n-1;i++){
6        if(colors[i] != colors[n-1]){
7            dis = Math.max(dis ,(n-1)-i);
8            break;
9        }
10       }
11       for(int i=n-1;i>=1;i--){
12        if(colors[0]!=colors[i]){
13        dis = Math.max(dis,i);
14       }
15       }
16       return dis;
17    
18    }
19}