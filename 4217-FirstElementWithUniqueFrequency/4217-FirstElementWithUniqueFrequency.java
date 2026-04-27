// Last updated: 4/27/2026, 10:50:05 PM
class Solution {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer, Integer> map=new HashMap<>();
        Map<Integer, Integer> freq=new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(int j: map.values()){
            freq.put(j, freq.getOrDefault(j,0)+1);
        }
        for(int num:nums){
            if(freq.get(map.get(num))==1){
                return num;
            }
        }
    return -1;
    }
}