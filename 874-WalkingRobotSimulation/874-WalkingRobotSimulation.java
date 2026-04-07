// Last updated: 4/7/2026, 2:37:51 PM
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
25
26            // Move forward
27            int[] direction = directions[currentDirection];
28            for (int step = 0; step < command; step++) {
29                int nextX = currentPosition[0] + direction[0];
30                int nextY = currentPosition[1] + direction[1];
31                if (obstacleSet.contains(hashCoordinates(nextX, nextY))) {
32                    break;
33                }
34                currentPosition[0] = nextX;
35                currentPosition[1] = nextY;
36            }
37
38            maxDistanceSquared = Math.max(
39                maxDistanceSquared,
40                currentPosition[0] * currentPosition[0] +
41                currentPosition[1] * currentPosition[1]
42            );
43        }
44
45        return maxDistanceSquared;
46    }
47    // Hash function to convert (x, y) coordinates to a unique integer value
48    private long hashCoordinates(long x, long y) {
49        return x + HASH_MULTIPLIER * y;
50    }
51}