// Last updated: 6/18/2026, 9:02:13 PM
class Solution {
    public double angleClock(int hour, int minutes) {
        double theta = Math.abs(60*hour - 11*minutes)/2.0;
        return theta > 180.0 ? 360.0-theta : theta;
    }
}