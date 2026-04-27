// Last updated: 4/27/2026, 10:52:07 PM
class Solution {
        public int minimumCoins(int[] A) {
        int n=A.length;
        int[] dp=new int[n+1];
        Deque<Integer> q=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!q.isEmpty() && (q.getFirst()+1)*2<i+1){
                q.removeFirst();
            }
            while(!q.isEmpty() && (dp[q.getLast()]+A[q.getLast()])>=dp[i]+A[i]){
                q.removeLast();
            }
            q.addLast(i);
            dp[i+1]=dp[q.getFirst()]+A[q.getFirst()];
        }
        return dp[n];
    }
}