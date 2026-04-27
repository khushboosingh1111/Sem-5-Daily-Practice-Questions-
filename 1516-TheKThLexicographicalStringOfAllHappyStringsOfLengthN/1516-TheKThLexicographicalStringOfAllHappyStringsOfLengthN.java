// Last updated: 4/27/2026, 10:53:51 PM
class Solution {
    int count = 0;
    String result = "";
    public String getHappyString(int n, int k) {
        StringBuilder sb = new StringBuilder();
        dfs(sb, n, k);

        return result;
    }
    private void dfs(StringBuilder sb, int n, int k) {

        if (sb.length() == n) {
            count++;

            if (count == k) {
                result = sb.toString();
            }
            return;
        }

        char[] chars = {'a', 'b', 'c'};

        for (char c : chars) {

            // avoid same adjacent characters
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c)
                continue;

            sb.append(c);                 // choose
            dfs(sb, n, k);                // explore
            sb.deleteCharAt(sb.length() - 1); // backtrack

            if (!result.equals("")) return; // stop early if found
        }
    }
}