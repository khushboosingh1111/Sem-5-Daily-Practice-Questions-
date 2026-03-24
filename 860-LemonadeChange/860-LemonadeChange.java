// Last updated: 3/24/2026, 12:29:36 PM
1class Solution {
2    public boolean lemonadeChange(int[] bills) {
3        int five=0;
4        int ten=0;
5        for(int i:bills){
6            if(i==5){
7                five++;
8            }
9            else if(i==10){
10                if(five>0){
11                    five--;
12                    ten++;
13                }
14                else{
15                    return false;
16                }
17            }
18            else{
19                if(five>0 && ten>0){
20                    five--;
21                    ten--;
22                }else if(five>=3){
23                    five-=3;
24                }
25                else{
26                    return false;
27                }
28            }
29        }   
30        return true;
31    }
32}