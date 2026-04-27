// Last updated: 4/27/2026, 10:50:28 PM
class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int x = -1;
        for(int i  = nums.length-1; i >-1;i--){
            if(map.containsKey(nums[i])){
                x = i+1;
                break;
            }
            map.put(nums[i],1);
        }
        return (x+2)/3;
    }
}