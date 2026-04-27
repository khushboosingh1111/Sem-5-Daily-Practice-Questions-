// Last updated: 4/27/2026, 10:50:10 PM
class Solution {
    public String reverseByType(String s) {
        StringBuilder letter=new StringBuilder();
        StringBuilder special=new StringBuilder();
        StringBuilder ans=new StringBuilder();
        int l=0;int sp=0;
        for(char ch:s.toCharArray()){
            if(ch>='a' && ch<='z'){
                letter.append(ch);
            }
            else{
                special.append(ch);
            }
        }
        letter.reverse();
        special.reverse();
        for(char ch:s.toCharArray()){
            if(ch>='a' && ch<='z'){
                ans.append(letter.charAt(l++));
            }
            else{
                ans.append(special.charAt(sp++));
            }
        }
        return ans.toString();
        
    }
}