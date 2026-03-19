// Last updated: 3/19/2026, 11:22:36 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int mx = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++) {

            if(nums[i] == 1) {
                count++;
                if(count > mx)
                    mx = count;
            }
            else
            {
                count = 0;
            }
        }
        return mx;
    }
}