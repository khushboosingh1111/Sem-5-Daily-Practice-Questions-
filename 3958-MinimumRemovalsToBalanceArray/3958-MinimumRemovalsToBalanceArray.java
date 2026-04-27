// Last updated: 4/27/2026, 10:51:23 PM
class Solution {
    public int minRemoval(int[] nums, int k) {
        if(nums.length == 1) return 0;
        Arrays.sort(nums);
        int n = nums.length;

        int left = 0;
        int ans = 1;

        for (int right = 0; right < n; right++) {
            //valid elements ki length tk
            while ((long) nums[right] > (long) nums[left] * k) {
                left++;
            }
            //kitne maximum element valid hai
            ans = Math.max(ans, right - left + 1);
        }
        //kitne elements dlt kren hai(total elements-valid elements)
        return n - ans;
    }
}