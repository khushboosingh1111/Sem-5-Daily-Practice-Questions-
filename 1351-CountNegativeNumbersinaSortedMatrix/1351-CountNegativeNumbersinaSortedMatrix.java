// Last updated: 1/3/2026, 1:06:15 PM
class Solution {
    public int countNegatives(int[][] nums) {

        int count = 0;
        int n = nums.length;

        for (int i = 0; i < nums.length; i++) {
            int low = 0;
            int high = nums[0].length-1;
            int ans = -1;
            while (low <= high) {

                int mid = low + (high - low) / 2;
                // System.out.println(mid);8
                if (nums[i][mid] >= 0) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                    ans = mid;
                }

            }
            if (ans != -1) {
                count += ( nums[0].length - ans );
            }
        }
        return count;
    }
}