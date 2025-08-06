// Last updated: 8/6/2025, 10:12:05 AM
class Solution {
    public String strWithout3a3b(int a, int b) {
        StringBuilder ans = new StringBuilder();
        String f = "a", s = "b";

        if (b > a) {
            f = "b"; s = "a";
            int temp = a; a = b; b = temp;
        }

        while (a > 0 || b > 0) {
            if (a > b) {
                ans.append(f);
                if (a > 1) ans.append(f);
                a -= 2;
            } else {
                ans.append(f);
                a--;
            }

            if (b > 0) {
                ans.append(s);
                b--;
            }
        }

        return ans.toString();
    }
}
