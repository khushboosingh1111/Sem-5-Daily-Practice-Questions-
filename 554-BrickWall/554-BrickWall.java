// Last updated: 8/6/2025, 10:13:46 AM
class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> m = new HashMap<>();
        int max = 0;

        for (List<Integer> row : wall) {
            int e = 0;
            for (int i = 0; i < row.size() - 1; i++) {
                e += row.get(i);
                int f = m.getOrDefault(e, 0) + 1;
                m.put(e, f);
                max = Math.max(max, f);
            }
        }

        return wall.size() - max;
    }
}
