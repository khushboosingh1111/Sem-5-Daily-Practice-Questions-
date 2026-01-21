// Last updated: 1/21/2026, 11:17:11 PM
1class Solution {
2    public int largestVariance(String s) {
3        
4        int [] freq = new int[26];
5        for(int i = 0 ; i < s.length() ; i++)
6            freq[(int)(s.charAt(i) - 'a')]++;
7        
8        int maxVariance = 0;
9        for(int a = 0 ; a < 26 ; a++){
10            for(int b = 0 ; b < 26 ; b++){
11                int remainingA = freq[a];
12                int remainingB = freq[b];
13                if(a == b || remainingA == 0 || remainingB == 0) continue;
14                
15				// run kadanes on each possible character pairs (A & B)
16                int currBFreq = 0, currAFreq = 0;
17                for(int i = 0 ; i < s.length() ; i++){
18                    int c =  (int)(s.charAt(i) - 'a');
19                    
20                    if(c == b) currBFreq++;
21                    if(c == a) {
22                        currAFreq++;
23                        remainingA--;
24                    }
25                    
26                    if(currAFreq > 0)
27                        maxVariance = Math.max(maxVariance, currBFreq - currAFreq);
28                    
29                    if(currBFreq < currAFreq &&  remainingA >= 1){
30                        currBFreq = 0;
31                        currAFreq = 0;
32                    }
33                }
34            }
35        }
36        
37        return maxVariance;
38    }
39}