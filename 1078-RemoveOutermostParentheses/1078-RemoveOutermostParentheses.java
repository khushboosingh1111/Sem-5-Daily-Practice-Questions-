// Last updated: 8/6/2025, 10:11:46 AM
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans=new StringBuilder();
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(count>0){
                    ans.append(ch);
                }
                count++;
            }
            else{
                count--;
                if(count>0){
                    ans.append(ch);
                }
            }
        }
        return ans.toString();
    }
}