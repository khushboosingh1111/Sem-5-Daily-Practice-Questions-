// Last updated: 8/6/2025, 10:12:40 AM
class Solution {
    public String shiftingLetters(String s, int[] shifts) {
  
    char[] wordArr=s.toCharArray();

        for(int i=shifts.length-2;i>=0;i--)
        {
            shifts[i]=(shifts[i]+shifts[i+1])%26;
        }

        for(int i=0;i<shifts.length;i++)
        {
            int i1 = ((shifts[i] + wordArr[i]-'a')%26)+'a';
            wordArr[i]= (char)i1;
        }
       return new String(wordArr);
    }
}