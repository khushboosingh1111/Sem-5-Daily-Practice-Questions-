// Last updated: 5/31/2026, 10:09:25 PM
1class Solution {
2    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
3        Arrays.sort(asteroids); // Sort by mass in ascending order
4        long currentMass = mass; // Preventing integer overflow
5        for (int asteroid : asteroids) {
6            // Traverse the asteroids in order, attempt to destroy and update mass or return the result
7            if (currentMass < asteroid) {
8                return false;
9            }
10            currentMass += asteroid;
11        }
12        return true; // Successfully destroy all asteroids
13    }
14}