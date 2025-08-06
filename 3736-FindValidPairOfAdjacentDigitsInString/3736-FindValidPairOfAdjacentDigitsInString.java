// Last updated: 8/6/2025, 10:09:10 AM
class Solution {
    public String findValidPair(String s) {
        for(int i = 0; i < s.length() - 1; i++){
            char a=s.charAt(i);
            char b=s.charAt(i+1);
            if (a != b && count(s, a) == (a - '0') 
                    && count(s, b) == (b - '0')) {
               return "" + a + b; 
            }
        }
        return "";
    }
        static int count(String s, char ch) {
        int ct = 0;
        for (char c : s.toCharArray()) {
            if (c == ch) ct++;
        }
        return ct;
        
    }
}