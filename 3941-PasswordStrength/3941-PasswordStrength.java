// Last updated: 5/26/2026, 12:22:05 AM
1class Solution {
2    HashSet<Character> hs = new HashSet<>();
3    public int passwordStrength(String password) {
4        int res = 0;
5        for(char ch : password.toCharArray()){
6            if(hs.contains(ch)){
7                continue;
8            }
9            if(isLowerCase(ch)){
10                res += 1;
11            }
12            else if(isUpperCase(ch)){
13                res += 2;
14            }
15            else if(isDigit(ch)){
16                res += 3;
17            }
18            else if(specialChar(ch)){
19                res += 5;
20            }
21            hs.add(ch);
22        }
23        return res;
24        
25    }
26    private boolean isLowerCase(char ch){
27        return ch >= 'a' && ch <= 'z';
28    }
29    private boolean isUpperCase(char ch){
30        return ch >= 'A' && ch <= 'Z' ;
31    }
32    private boolean isDigit(char ch){
33        return ch >= '0' && ch <= '9';
34    }
35    private boolean specialChar(char ch){
36        return "!@#$".indexOf(ch) != -1;
37    }
38}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           