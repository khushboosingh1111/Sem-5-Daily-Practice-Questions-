// Last updated: 8/6/2025, 10:15:39 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
      HashSet <Integer> set = new HashSet<>();
      for (int n: nums) {
        if (set.contains(n))
            return true;
        set.add(n);
      }
      return false;
    }
}