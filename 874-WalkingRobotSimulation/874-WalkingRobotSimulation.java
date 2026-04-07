// Last updated: 4/7/2026, 2:38:38 PM
1class Solution {
2    private static final long HASH_MULTIPLIER = 60013; // Slightly larger than 2 * max coordinate value
3    public int robotSim(int[] commands, int[][] obstacles) {
4        // Store obstacles in an HashSet for efficient lookup
5        Set<Long> obstacleSet = new HashSet<>();
6        for (int[] obstacle : obstacles) {
7            obstacleSet.add(hashCoordinates(obstacle[0], obstacle[1]));
8        }
9        // Define direction vectors: North, East, South, West
10        int[][] directions = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
11        int[] currentPosition = { 0, 0 };
12        int maxDistanceSquared = 0;
13        int currentDirection = 0; // 0: North, 1: East, 2: South, 3: West
14        for (int command : commands) {
15            if (command == -1) {
16                // Turn right
17                currentDirection = (currentDirection + 1) % 4;
18                continue;
19            }
20            if (command == -2) {
21                // Turn left
22                currentDirection = (currentDirection + 3) % 4;
23                continue;
24            }
25            // Move forward
26            int[] direction = directions[currentDirection];
27            for (int step = 0; step < command; step++) {
28                int nextX = currentPosition[0] + direction[0];
29                int nextY = currentPosition[1] + direction[1];
30                if (obstacleSet.contains(hashCoordinates(nextX, nextY))) {
31                    break;
32                }
33                currentPosition[0] = nextX;
34                currentPosition[1] = nextY;
35            }
36
37            maxDistanceSquared = Math.max(
38                maxDistanceSquared,
39                currentPosition[0] * currentPosition[0] +
40                currentPosition[1] * currentPosition[1]
41            );
42        }
43
44        return maxDistanceSquared;
45    }
46    // Hash function to convert (x, y) coordinates to a unique integer value
47    private long hashCoordinates(long x, long y) {
48        return x + HASH_MULTIPLIER * y;
49    }
50}