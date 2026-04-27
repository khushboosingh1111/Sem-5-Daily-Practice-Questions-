// Last updated: 4/27/2026, 10:50:21 PM
class Solution {
    public String reversePrefix(String s, int k) {
        char[] temp = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = k - 1; i >= 0; i--){
            sb.append(temp[i]);
        }    
        for(int i = k; i < temp.length; i++){
            sb.append(temp[i]);
        }
        return sb.toString();
        
    }
}