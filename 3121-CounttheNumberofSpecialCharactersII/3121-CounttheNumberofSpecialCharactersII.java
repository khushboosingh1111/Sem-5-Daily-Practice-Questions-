// Last updated: 6/12/2026, 9:59:40 PM
1class Solution {
2    public int numberOfSpecialChars(String word) {
3
4        int lowercase[]=new int[26];
5        int uppercase[]=new int[26];
6        Arrays.fill(lowercase,-1);
7        Arrays.fill(uppercase,-1);
8        int count=0;
9        for(int i=0;i<word.length();i++)
10        {
11            char ch=word.charAt(i);
12            if(ch>='a' && ch<='z')
13            {
14                lowercase[ch-'a']=i;
15            }
16            else{
17                int index= ch-'A';
18                if(uppercase[index]==-1)
19                {
20                    uppercase[index]=i;
21                }
22            }
23        }  
24        for(int i=0;i<26;i++)
25        {
26            if(lowercase[i]!=-1 && uppercase[i]!=-1 && lowercase[i]<uppercase[i])
27            {
28                count++;
29            }
30        }
31        return count;
32    }
33}