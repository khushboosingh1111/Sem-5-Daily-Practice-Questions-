// Last updated: 8/6/2025, 10:09:32 AM
class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] d = new int[n + 1]; 

        for (int[] query : queries) {
            int st = query[0];
            int end = query[1];
            d[st]--;
            if (end + 1 < n) {
                d[end + 1]++; 
            }
        }

        int c = 0;
        for (int i = 0; i < n; i++) {
            c += d[i]; 
            nums[i] += c; 
            if (nums[i] < 0) {    
                nums[i] = 0;    
            }
        }

        for (int num : nums) {
            if (num != 0) {
                return false;     
            }
        }
        return true;
    }
}