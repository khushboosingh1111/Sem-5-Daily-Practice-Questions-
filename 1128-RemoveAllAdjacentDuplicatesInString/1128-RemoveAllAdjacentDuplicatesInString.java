// Last updated: 8/6/2025, 10:11:42 AM
class Solution {
    public String removeDuplicates(String s) {
        char[] cs = s.toCharArray();
        int top = -1;
        int ind = 0;
        while(ind < s.length()){
            if(top == -1 || cs[top] != cs[ind]){
                top += 1;
                cs[top] = cs[ind];
            }
            else
                top -= 1;
            ind += 1;
        }
        return new String(cs, 0, top + 1);
    }
}