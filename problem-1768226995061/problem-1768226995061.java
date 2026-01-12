// Last updated: 1/12/2026, 7:39:55 PM
1class Solution {
2    public int removeBoxes(int[] boxes) {
3        if(boxes.length==0){
4            return 0;
5        }
6        int size=boxes.length;
7        int[][][] dp=new int[size][size][size];
8        return get(dp,boxes,0,size-1,0);
9    }
10    private int get(int[][][] dp,int[] boxes,int left,int right,int streak){
11        if(left>right){
12            return 0;
13        }
14        if(dp[left][right][streak]>0){
15            return dp[left][right][streak];
16        }
17        int templeft=left;
18        int tempstreak=streak;
19        while(left+1<=right && boxes[left+1]==boxes[left]){
20            left++;
21            streak++;
22        }
23        int max=(streak+1)*(streak+1)+get(dp,boxes,left+1,right,0);
24        for(int i=left+1;i<=right;i++){
25            if(boxes[left]==boxes[i]){
26                max=Math.max(max,get(dp,boxes,left+1,i-1,0)+get(dp,boxes,i,right,streak+1));
27            }
28        }
29        dp[templeft][right][tempstreak]=max;
30        return max;
31    }
32}