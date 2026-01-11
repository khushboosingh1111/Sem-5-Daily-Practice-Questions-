// Last updated: 1/12/2026, 12:06:52 AM
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
14        else if(left==right){
15            return (streak+1)*(streak+1);
16        }
17        else if(dp[left][right][streak]!=0){
18            return dp[left][right][streak];
19        }
20        else{
21            int max=get(dp,boxes,left+1,right,0)+(streak+1)*(streak+1);
22            for(int i=left+1;i<=right;i++){
23                if(boxes[left]==boxes[i]){
24                    max=Math.max(max,get(dp,boxes,left+1,i-1,0)+get(dp,boxes,i,right,streak+1));
25                }
26            }
27            dp[left][right][streak]=max;
28            return max;
29        }
30    }
31}