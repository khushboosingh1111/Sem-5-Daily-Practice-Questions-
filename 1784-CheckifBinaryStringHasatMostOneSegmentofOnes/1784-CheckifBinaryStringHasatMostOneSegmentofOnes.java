// Last updated: 3/6/2026, 4:09:47 PM
class Solution {
    public boolean checkOnesSegment(String s) {
      s=s.replaceAll("^0+|0+$","");
      return !s.contains("0");
    }
}