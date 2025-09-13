// Last updated: 9/13/2025, 7:50:24 PM
class Solution {
    public int minOperations(String s) {
        int maxSteps = 0;

        for (char ch : s.toCharArray()) {
            int steps = ('a' - ch + 26) % 26;
            maxSteps = Math.max(maxSteps, steps);
        }
        return maxSteps;
        
        
    }
}