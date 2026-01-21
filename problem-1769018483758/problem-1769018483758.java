// Last updated: 1/21/2026, 11:31:23 PM
1class Solution {
2    public int largestVariance(String s) {
3        int occur[] = new int [26];
4        char ch[] = s.toCharArray();
5
6        for(char c : ch){
7            occur[c - 'a'] = 1;
8        }
9
10        int maxVariance = 0;
11
12        for(int i = 0; i<26; i++){
13            for(int j = 0; j<26; j++){
14                if(i == j){
15                    continue;
16                }
17
18                //now we chack this two char are present in the string or not
19                if(occur[i] == 1 && occur[j] == 1){
20                    int f1 = 0;
21                    int f2 = 0;
22                    boolean isPrevOccr = false;
23                    for(char c : ch){
24                        if(i == (c - 'a')){
25                            f1++;
26                        }
27                        if(j == (c - 'a')){
28                            f2++;
29                        }
30
31                        if(f1 > 0 && f2 > 0){
32                            maxVariance = Math.max(maxVariance, f1 - f2);
33                        }
34                        else if (f1 > 0 && f2 == 0 && isPrevOccr){
35                            maxVariance = Math.max(maxVariance, f1 - 1);
36                        }
37
38                        if(f2 > f1){
39                            f1 = 0;
40                            f2 = 0;
41                            isPrevOccr = true;
42                        }
43                    }
44                }
45            }
46        }
47        return maxVariance ;
48    }
49}