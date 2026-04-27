// Last updated: 4/27/2026, 10:50:03 PM
class Solution {
    public String trimTrailingVowels(String s) {
        int i = s.length() - 1;
        while (i >= 0 && 
              "aeiou".indexOf(s.charAt(i)) != -1) {
            i--;
        }
        
        return s.substring(0, i + 1);
    }
}