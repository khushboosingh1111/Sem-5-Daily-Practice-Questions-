// Last updated: 4/27/2026, 10:50:19 PM
class Solution {
    public String largestEven(String s) {
        int idx = s.lastIndexOf('2');
        if(idx!=-1) return s.substring(0,idx+1);
        return "";
    }
}
  