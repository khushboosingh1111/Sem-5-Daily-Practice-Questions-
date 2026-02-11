// Last updated: 2/11/2026, 12:45:51 PM
1class Solution {
2    public int findMaximumXOR(int[] arr) {
3        Trie t=new Trie();
4		for(int x:arr) {
5			t.add(x);
6		}
7		int ans=0;
8		for(int x:arr) {
9			ans=Math.max(t.getMaxXor(x), ans);
10		}
11		return ans;
12    }
13    static class Trie{
14		class Node{
15			Node zero;
16			Node one;
17		}
18		private Node root=new Node();
19		public void add(int val) {
20			Node curr=root;
21			for(int i=31;i>=0;i--) { //ulta loop kyuki hume msb ko check krna h vo zero hai ya one toh starting bit check krenge 32 bit k number m
22				int bit=val&(1<<i); //i time &(i.e and) krke huma first bit value nikalnege
23				if(bit==0) { //agr bit 0 hai toh 0 tha 
24					//agr 0 hai toh vha pocha de nhi hai toh new bna de
25					if(curr.zero!=null) {
26						curr=curr.zero;
27					}
28					else { //agr one huya toh udhr i time and krke shift krke msb bit 1 tha
29						Node nn=new Node();
30						curr.zero=nn;
31						curr=nn;
32					}
33				}
34				else {
35					if(curr.one!=null) {
36						curr=curr.one;
37					}
38					else {
39						Node nn=new Node();
40						curr.one=nn;
41						curr=nn;
42					}
43					
44				}
45				
46			}
47		}
48		public int getMaxXor(int x) {
49			int ans=0;
50			Node curr=root;
51			for(int i=31;i>=0;i--) {
52				int bit=x&(1<<i);
53				if(bit==0) {
54					if(curr.one!=null) {
55						ans=ans | (1<<i);
56						curr=curr.one;
57					}
58					else {
59						curr=curr.zero;
60					}
61				}
62				else {
63					if(curr.zero!=null) {
64						ans=ans | (1<<i);
65						curr=curr.zero;
66					}
67					else {
68						curr=curr.one;
69					}
70					
71				}
72			}
73			return ans;
74		}
75	}
76}
77
78