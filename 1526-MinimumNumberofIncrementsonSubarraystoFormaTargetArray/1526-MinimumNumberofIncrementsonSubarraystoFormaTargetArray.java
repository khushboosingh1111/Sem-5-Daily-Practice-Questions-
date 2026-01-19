// Last updated: 1/19/2026, 10:04:39 PM
1class Solution {
2    public int minNumberOperations(int[] target) {
3        int ops=target[0];
4        for(int i=1;i<target.length;i++){
5            if(target[i]>target[i-1]){
6                ops+=target[i]-target[i-1];
7            }
8        }
9        return ops;
10    }
11}