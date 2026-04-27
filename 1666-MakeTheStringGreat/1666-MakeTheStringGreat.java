// Last updated: 4/27/2026, 10:53:39 PM
class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder str=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(!st.isEmpty() && Math.abs(ch-st.peek())==32){
                st.pop();
            }
            else{
                st.push(ch);
            }  
        }
        while(!st.isEmpty()){
            str.insert(0,st.pop());
        }
        return str.toString();
    }
}