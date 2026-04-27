// Last updated: 4/27/2026, 10:52:52 PM
class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        if(rows==1){
            return encodedText;
        }
        int len=encodedText.length();
        int col=len/rows;
        StringBuilder sb=new StringBuilder(len);
        for(int i=0;i<col;i++){
            int r=0,j=i;
            while(r<rows && j<col){
                sb.append(encodedText.charAt(r*col+j));
                r++;
                j++;
            }
        }
        int end=sb.length()-1;
        while(end>=0 && sb.charAt(end)==' '){
            end--;
        }
        return sb.substring(0,end+1);
    }
}