// Last updated: 8/6/2025, 10:15:53 AM
class Solution {
    public String largestNumber(int[] nums) {
        // Convert each number to a string
        String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            str[i] = String.valueOf(nums[i]);
        }

        // Sort using custom comparator
        Arrays.sort(str, (a, b) -> (b + a).compareTo(a + b));

        // If the largest number is "0", return "0"
        if (str[0].equals("0")) return "0";

        // Join all strings
        StringBuilder result = new StringBuilder();
        for (String s : str) {
            result.append(s);
        }

        return result.toString();
    }
}