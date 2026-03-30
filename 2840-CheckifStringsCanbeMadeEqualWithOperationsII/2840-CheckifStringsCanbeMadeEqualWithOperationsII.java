// Last updated: 3/30/2026, 8:56:37 PM
1class Solution {
2    public boolean checkStrings(String s1, String s2) {
3        int  n = s1.length();
4        int freq1[]=new int[26];
5        for(int i=0;i<n;i+=2){
6            freq1[s1.charAt(i)-'a']++;
7        }
8        int freq2[]=new int[26];
9        for(int i=0;i<n;i+=2){
10            freq2[s2.charAt(i)-'a']++;
11        }
12        for(int i =0;i<26;i++){
13            if(freq1[i]!=freq2[i])return false;
14            freq1[i]=0;
15            freq2[i]=0;
16        }
17        for(int i=1;i<n;i+=2){
18            freq1[s1.charAt(i)-'a']++;
19        }
20        for(int i=1;i<n;i+=2){
21            freq2[s2.charAt(i)-'a']++;
22        }
23        for(int i =0;i<26;i++){
24            if(freq1[i]!=freq2[i])return false;
25        }
26        return true;
27    }
28}