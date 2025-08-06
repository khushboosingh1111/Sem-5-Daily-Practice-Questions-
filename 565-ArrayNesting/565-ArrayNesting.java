// Last updated: 8/6/2025, 10:13:42 AM
class Solution {
    public int arrayNesting(int[] nums) {
        int maxLength = 0;
        boolean[] visited = new boolean[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                int start = i;
                int count = 0;

                while (!visited[start]) {
                    visited[start] = true;
                    start = nums[start];
                    count++;
                }

                maxLength = Math.max(maxLength, count);
            }
        }

        return maxLength;
    }
}