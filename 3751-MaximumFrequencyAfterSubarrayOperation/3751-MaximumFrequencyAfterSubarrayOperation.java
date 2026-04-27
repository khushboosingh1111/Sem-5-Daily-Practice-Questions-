// Last updated: 4/27/2026, 10:51:37 PM
class Solution {
    public int maxFrequency(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int countk = 0;
        int max = 0;
        for(int x : nums){
            if(x==k){
                countk++;
            }else{
                int curr = map.getOrDefault(x,0)-countk;
                curr = Math.max(1,curr+1);
                map.put(x,curr+countk);
                max = Math.max(max,curr);
            }
        }
        return countk+max;
    }
}