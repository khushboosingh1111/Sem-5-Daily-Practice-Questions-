// Last updated: 2/5/2026, 12:12:52 PM
1class Solution {
2    public String replaceWords(List<String> dictionary, String sentence) {
3       Trie t=new Trie();
4		for(String s:dictionary) {
5			t.insert(s);
6		}
7		String[] arr=sentence.split(" ");
8		StringBuilder sb=new StringBuilder();
9		for(int i=0;i<arr.length;i++) {
10			String get=t.search(arr[i]);
11			sb.append(get+" ");
12		}
13        return sb.toString().trim();
14	}
15	static class Trie{  //static bnaega kyuki inner class ka object bn rha
16		class Node{
17			char ch;
18			String isTerminal;
19			HashMap<Character,Node> child;
20			public Node(char ch) {
21				this.ch=ch;
22				child=new HashMap<>();
23			}
24		}
25		private Node root=new Node('*');
26		public void insert(String word) {
27	        Node curr=root;
28	        for(int i=0;i<word.length();i++) {
29	        	char ch=word.charAt(i);
30	        	if(curr.child.containsKey(ch)) {
31	        		curr=curr.child.get(ch);
32	        	}
33	        	else {
34	        		Node nn=new Node(ch);
35	        		curr.child.put(ch, nn);
36	        		curr=nn;
37	        	}
38	        }
39	        curr.isTerminal = word;
40	    }
41		public String search(String word) {
42			Node curr=root;
43	        for(int i=0;i<word.length();i++) {
44	        	char ch=word.charAt(i);
45	        	if(curr.child.containsKey(ch)) {
46	        		curr=curr.child.get(ch);
47	        		if(curr.isTerminal!=null) {
48	        			return curr.isTerminal;
49	        		}
50	        	}
51	        	else {
52	        		return word;
53	        	}
54	        }
55	        return word;
56	    }
57		
58	}
59}