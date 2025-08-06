// Last updated: 8/6/2025, 10:12:53 AM
class Solution {
    public String customSortString(String order, String s) {
        int[] freq=new int[26];
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray())
        freq[ch-97]++;
        for(char ch:order.toCharArray())
            while(freq[ch-97]-->0)
            sb.append(ch);
        for(char ch:s.toCharArray())
            while(freq[ch-97]-->0)
            sb.append(ch);
        return sb.toString();
    }
}