// Last updated: 6/19/2026, 9:46:53 PM
1class Solution {
2  public int largestAltitude(int[] gain) {
3    int currentAltitude = 0;
4    // Highest altitude currently is 0.
5    int highestPoint = currentAltitude;
6
7    for (int altitudeGain : gain) {
8      // Adding the gain in altitude to the current altitude.
9      currentAltitude += altitudeGain;
10      // Update the highest altitude.
11      highestPoint = Math.max(highestPoint, currentAltitude);
12    }
13
14    return highestPoint;
15  }
16}