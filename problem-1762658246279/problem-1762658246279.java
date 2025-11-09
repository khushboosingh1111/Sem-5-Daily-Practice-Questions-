// Last updated: 11/9/2025, 8:47:26 AM
class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer,ArrayList<Integer>>map=new HashMap<>();
        boolean found=true;
        for(int i=0;i<nums.length;i++){
            map.putIfAbsent(nums[i],new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        int ans=Integer.MAX_VALUE;
        for(int ke:map.keySet()){
            ArrayList<Integer> l=map.get(ke);
            Collections.sort(l);
            if(l.size()>2){
                for(int i=0;i<l.size()-2;i++){
                    int a=l.get(i);
                    int b=l.get(i+1);
                    int c=l.get(i+2);
                    int ans2=Math.abs(a-b)+Math.abs(b-c)+Math.abs(c-a);
                    ans=Math.min(ans,ans2);
                }
            }
        }
        found=false;
    return ans==Integer.MAX_VALUE?-1:ans;
    }
}