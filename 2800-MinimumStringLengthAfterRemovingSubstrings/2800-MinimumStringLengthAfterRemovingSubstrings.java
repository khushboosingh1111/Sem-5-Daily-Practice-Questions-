// Last updated: 4/27/2026, 10:52:23 PM
class Solution {

    public int minLength(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.isEmpty()){
                st.push(s.charAt(i));
                continue;
            }
            if(ch=='B' && st.peek()=='A'){
                st.pop();
            }
            else if(ch=='D' && st.peek()=='C'){
                st.pop();
            }
            else{
                st.push(ch);
            }

        }
        return st.size();
    }
}