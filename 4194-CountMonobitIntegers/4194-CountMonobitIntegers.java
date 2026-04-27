// Last updated: 4/27/2026, 10:50:13 PM
class Solution {
    public int countMonobit(int n) {
        int count = 1; // for 0
        int k = 1;
        while ((1 << k) - 1 <= n) { 
            count++;
            k++;
        }

        return count;
    }
}