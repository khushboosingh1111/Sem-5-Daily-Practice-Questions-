// Last updated: 8/6/2025, 10:16:24 AM
class Solution {
    public static int candy(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;

        int[] candy = new int[n];
        // Step 1: Give 1 candy to everyone
        for (int i = 0; i < n; i++) {
            candy[i] = 1;
        }

        // Step 2: Left to Right
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                candy[i] = candy[i - 1] + 1;
            }
        }

        // Step 3: Right to Left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                candy[i] = Math.max(candy[i], candy[i + 1] + 1);
            }
        }

        // Step 4: Sum total candies
        int total = 0;
        for (int c : candy) {
            total += c;
        }
        return total;
    }
}
