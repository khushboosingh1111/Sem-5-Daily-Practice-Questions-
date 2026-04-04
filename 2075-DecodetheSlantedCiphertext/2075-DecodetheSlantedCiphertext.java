// Last updated: 4/4/2026, 8:13:48 PM
1class Solution {
2    public String decodeCiphertext(String encodedText, int rows) {
3        if(rows==1){
4            return encodedText;
5        }
6        int len=encodedText.length();
7        int col=len/rows;
8        StringBuilder sb=new StringBuilder(len);
9        for(int i=0;i<col;i++){
10            int r=0,j=i;
11            while(r<rows && j<col){
12                sb.append(encodedText.charAt(r*col+j));
13                r++;
14                j++;
15            }
16        }
17        int end=sb.length()-1;
18        while(end>=0 && sb.charAt(end)==' '){
19            end--;
20        }
21        return sb.substring(0,end+1);
22    }
23}