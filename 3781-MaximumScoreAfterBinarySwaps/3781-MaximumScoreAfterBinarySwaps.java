// Last updated: 1/15/2026, 4:35:55 PM
1class Solution {
2    public long maximumScore(int[] nums, String s) {
3        //1 ko peeche left m move kr skte h
4        long res=0;
5        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
6        for(int i=0;i<nums.length;i++){
7            pq.offer(nums[i]);
8            if(s.charAt(i)=='1'){
9                res+=pq.poll();
10            }
11        }
12        return res;
13        
14    }
15}