// Last updated: 4/27/2026, 10:50:35 PM
class Solution {
    public long maximumScore(int[] nums, String s) {
        //1 ko peeche left m move kr skte h
        long res=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<nums.length;i++){
            pq.offer(nums[i]);
            if(s.charAt(i)=='1'){
                res+=pq.poll();
            }
        }
        return res;
        
    }
}