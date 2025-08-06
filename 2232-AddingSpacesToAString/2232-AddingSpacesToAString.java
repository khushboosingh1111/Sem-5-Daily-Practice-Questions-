// Last updated: 8/6/2025, 10:10:16 AM
class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int c = 0;
        int i = 0;
        for(char ch :s.toCharArray() ){
            if(i<spaces.length && c==spaces[i]){
                sb.append(' ');
                i++;
            }
            sb.append(ch);
            c++;
        }
        return sb.toString();
    }
}