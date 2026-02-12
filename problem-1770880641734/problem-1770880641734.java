// Last updated: 2/12/2026, 12:47:21 PM
1class Solution {
2    public int[] maximizeXor(int[] arr, int[][] queries) {
3        int[][] q=new int[queries.length][3];
4		for(int i=0;i<q.length;i++) {
5			q[i][0]=queries[i][0];//xi
6			q[i][1]=queries[i][1];//mi
7			q[i][2]=i; //i
8		}
9		Arrays.sort(q,(a,b)->a[1]-b[1]);
10		Arrays.sort(arr);
11		int[] ans=new int[q.length];
12		Trie t=new Trie();
13		int j=0;//index
14		for(int[] a : q) {
15			while(j<arr.length && arr[j]<=a[1]) {
16				t.add(arr[j]);
17				j++;
18			}
19			if(j==0) {
20				ans[a[2]]=-1; //a[2] querie ka positiona btayega
21			}
22			else {
23				ans[a[2]]=t.getMaxXor(a[0]);
24			}
25		}
26		return ans;
27    }
28    static class Trie{
29		class Node{
30			Node zero;
31			Node one;
32		}
33		private Node root=new Node();
34		public void add(int val) {
35			Node curr=root;
36			for(int i=31;i>=0;i--) { //ulta loop kyuki hume msb ko check krna h vo zero hai ya one toh starting bit check krenge 32 bit k number m
37				int bit=val&(1<<i); //i time &(i.e and) krke huma first bit value nikalnege
38				if(bit==0) { //agr bit 0 hai toh 0 tha 
39					//agr 0 hai toh vha pocha de nhi hai toh new bna de
40					if(curr.zero!=null) {
41						curr=curr.zero;
42					}
43					else { //agr one huya toh udhr i time and krke shift krke msb bit 1 tha
44						Node nn=new Node();
45						curr.zero=nn;
46						curr=nn;
47					}
48				}
49				else {
50					if(curr.one!=null) {
51						curr=curr.one;
52					}
53					else {
54						Node nn=new Node();
55						curr.one=nn;
56						curr=nn;
57					}
58					
59				}
60				
61			}
62		}
63		public int getMaxXor(int x) {
64			int ans=0;
65			Node curr=root;
66			for(int i=31;i>=0;i--) {
67				int bit=x&(1<<i);
68				if(bit==0) {
69					if(curr.one!=null) {
70						ans=ans | (1<<i);
71						curr=curr.one;
72					}
73					else {
74						curr=curr.zero;
75					}
76				}
77				else {
78					if(curr.zero!=null) {
79						ans=ans | (1<<i);
80						curr=curr.zero;
81					}
82					else {
83						curr=curr.one;
84					}
85					
86				}
87			}
88			return ans;
89		}
90	}
91}
92
93