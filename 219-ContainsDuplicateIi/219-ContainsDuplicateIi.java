// Last updated: 8/6/2025, 10:15:38 AM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int prev=map.get(nums[i]);
                if(i-prev<=k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
}