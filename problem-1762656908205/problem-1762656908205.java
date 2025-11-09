// Last updated: 11/9/2025, 8:25:08 AM
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
            if(l.size()<3){
                continue;
            }
            for(int i=0;i<l.size();i++){
                for(int j=i+1;j<l.size();j++){
                    for(int k=j+1;k<l.size();k++){
                        int a=l.get(i);
                        int b=l.get(j);
                        int c=l.get(k);
                        int dif=Math.abs(a-b)+Math.abs(b-c)+Math.abs(c-a);
                        ans=Math.min(ans,dif);
                    }
                }
            }
        }
        return ans==Integer.MAX_VALUE ?-1:ans;
        
    }
}