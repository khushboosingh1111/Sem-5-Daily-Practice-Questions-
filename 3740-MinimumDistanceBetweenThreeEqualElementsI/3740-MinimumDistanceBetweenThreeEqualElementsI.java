// Last updated: 11/16/2025, 11:55:21 PM
class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.putIfAbsent(nums[i],new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        int ans=Integer.MAX_VALUE;
        for(int ke:map.keySet()){
            List<Integer>l=map.get(ke);
            Collections.sort(l);
            if(l.size()>2){
                for(int i=0;i<l.size()-2;i++){
                    int a=l.get(i);
                    int b=l.get(i+1);
                    int c=l.get(i+2);
                    int dif=Math.abs(a-b)+Math.abs(b-c)+Math.abs(c-a);
                    ans=Math.min(ans,dif);
                }
            }
        }
        return ans==Integer.MAX_VALUE ?-1:ans;
        
    }
}