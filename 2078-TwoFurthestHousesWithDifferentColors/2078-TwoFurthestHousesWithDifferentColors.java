// Last updated: 4/20/2026, 9:52:35 PM
class Solution {
    public int maxDistance(int[] colors) {
       int dis = 0;
       int n = colors.length;
       for(int i=0;i<n-1;i++){
        if(colors[i] != colors[n-1]){
            dis = Math.max(dis ,(n-1)-i);
            break;
        }
       }
      

       for(int i=n-1;i>=1;i--){
        if(colors[0]!=colors[i]){
        dis = Math.max(dis,i);
       }
       }
       return dis;
    
    }
}