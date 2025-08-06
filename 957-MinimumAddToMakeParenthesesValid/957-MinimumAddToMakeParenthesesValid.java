// Last updated: 8/6/2025, 10:12:22 AM
class Solution {
    public int minAddToMakeValid(String s) {
        int op = 0, cl = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                cl++;
            } else if (cl > 0)
                cl--;
            else
                op++;
        }

        return op + cl;
    }
}
