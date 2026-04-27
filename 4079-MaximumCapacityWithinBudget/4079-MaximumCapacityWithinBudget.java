// Last updated: 4/27/2026, 10:50:52 PM
class Solution {
    public int maxCapacity(int[] costs, int[] capacity, int budget) {
        int n = costs.length;
        // Sort the values by (cost, capacity)
        int[][] items = new int[n][2];
        for (int i = 0; i < n; i++)
            items[i] = new int[]{costs[i], capacity[i]};
        Arrays.sort(items, (a, b) -> a[0] != b[0] ? (a[0] - b[0]) : (a[1] - b[1]));

        // Calculate max capacity prefix
        int[] cap_prefix = new int[n];
        for (int i = 0; i < n; i++)
            cap_prefix[i] = Math.max(i > 0 ? cap_prefix[i - 1] : 0, items[i][1]);

        // Use two pointers to find best match
        int result = 0, r = n - 1;
        for (int l = 0; l < n; l++) {
            int cst = items[l][0], cap = items[l][1];
            if (cst >= budget) 
                break;

            // One machine
            result = Math.max(result, cap_prefix[l]);

            // Two machines
            // Try to find another machine to increase capacity with budget left
            int limit = budget - cst;
            while (r >= 0 && items[r][0] >= limit) 
                r--;

            // Take only in range [0, i) to avoid using the same machine twice
            int j = Math.min(r, l - 1);
            if (j >= 0)
                result = Math.max(result, cap + cap_prefix[j]);
        }

        return result;
    }
}