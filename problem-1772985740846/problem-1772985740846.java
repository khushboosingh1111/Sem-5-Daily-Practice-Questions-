// Last updated: 3/8/2026, 9:32:20 PM
1class Solution {
2    public String findDifferentBinaryString(String[] nums) {
3        StringBuilder ans = new StringBuilder();
4        for (int i = 0; i < nums.length; i++) {
5            Character curr = nums[i].charAt(i);
6            ans.append(curr == '0' ? '1' : '0');
7        }
8        
9        return ans.toString();
10    }
11}