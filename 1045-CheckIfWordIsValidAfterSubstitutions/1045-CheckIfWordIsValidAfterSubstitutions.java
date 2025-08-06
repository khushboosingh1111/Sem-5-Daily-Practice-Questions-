// Last updated: 8/6/2025, 10:11:59 AM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='c'){
                if(st.isEmpty() || st.pop()!='b') return false;
                if(st.isEmpty() || st.pop()!='a') return false;
            }else{
                st.push(ch);
            }
            
        }
        return st.isEmpty();
    }
}