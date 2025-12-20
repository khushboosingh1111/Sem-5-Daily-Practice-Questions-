// Last updated: 12/20/2025, 9:19:31 PM
1class Solution {
2    public long maximumScore(int[] nums, String s) {
3        long res=0;
4        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
5        for(int i=0;i<nums.length;i++){
6            pq.offer(nums[i]);
7            if(s.charAt(i)=='1'){
8                res+=pq.poll();
9            }
10        }
11        return res;
12        
13    }
14}