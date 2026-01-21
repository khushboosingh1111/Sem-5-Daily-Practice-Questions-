// Last updated: 1/21/2026, 12:40:04 PM
1class Solution {
2    public int minimizeXor(int num1, int num2) {
3        int set_bit=0;
4		while(num2>0) {
5			num2=(num2&(num2-1));
6			set_bit++;
7		}
8		int x=0;
9		for(int i=30;i>=0;i--) {
10			int mask=(1<<i); //konsi didgit pr 1 mila hai uss i pr ya uss jgh pr 1 rekheneg
11			if((num1&mask)!=0) {//jha jha 1 aa rha udhr uski according 1 rkho x mai
12				x|=mask; //x=x|mask;
13				set_bit--; //set bit ko kum krenge
14				if(set_bit==0) { //agr set bit khtm ho gyi toh loop ko break kr do aur yhi se x return kr do bit khtm ho gyi ab choti value bnane k liye pecche se 1 rkhne k liye ab 1 nhi bacha
15					return x; //no of set bit khtm jisse hum value bna skte h toh yha se vo number return krdo
16				}
17			}
18		}
19		//minimum bnane k liye last m bit add krenge bachi huyyi
20		for(int i=0;i<=30;i++) {
21			int mask=(1<<i);
22			if((num1 & mask)==0) {
23				x|=mask; //x=x|mask;
24				set_bit--;
25				if(set_bit==0) {
26					return x;
27				}
28			}
29			
30		}
31		return x;
32		
33	}
34
35}
36