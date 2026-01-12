// Last updated: 1/12/2026, 7:38:57 PM
1class Solution {
2        public int minimumCoins(int[] A) {
3        int n=A.length;
4        int[] dp=new int[n+1];
5        Deque<Integer> q=new ArrayDeque<>();
6        for(int i=0;i<n;i++){
7            while(!q.isEmpty() && (q.getFirst()+1)*2<i+1){
8                q.removeFirst();
9            }
10            while(!q.isEmpty() && (dp[q.getLast()]+A[q.getLast()])>=dp[i]+A[i]){
11                q.removeLast();
12            }
13            q.addLast(i);
14            dp[i+1]=dp[q.getFirst()]+A[q.getFirst()];
15        }
16        return dp[n];
17    }
18}