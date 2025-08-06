// Last updated: 8/6/2025, 10:10:18 AM
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int t=0;
        for(int i=0;i<tickets.length;i++){
            if(i<=k){
                t+=Math.min(tickets[i],tickets[k]);

            }
            else {
                t+=Math.min(tickets[i],tickets[k]-1);
            }
        }
        return t;
    }
}