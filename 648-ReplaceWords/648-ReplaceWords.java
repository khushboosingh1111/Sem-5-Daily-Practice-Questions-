// Last updated: 2/5/2026, 12:57:12 PM
1class Solution {
2    static List<String> ll;
3    public List<String> findWords(char[][] maze, String[] words) {
4		// TODO Auto-generated method stub
5		Trie t=new Trie();
6        ll=new ArrayList<>();
7		for(String s:words) {
8			t.insert(s);
9		}
10		for(int i=0;i<maze.length;i++) {
11			for(int j=0;j<maze[0].length;j++) {
12				if(t.root.child.containsKey(maze[i][j])) {
13					t.Search(maze,i,j,t.root);
14				}
15			}
16		}
17        return ll;
18	}
19	static class Trie{  //static bnaega kyuki inner class ka object bn rha
20		class Node{
21			char ch;
22			String isTerminal;
23			HashMap<Character,Node> child;
24			public Node(char ch) {
25				this.ch=ch;
26				child=new HashMap<>();
27			}
28		}
29		Node root=new Node('*');
30		public void insert(String word) {
31	        Node curr=root;
32	        for(int i=0;i<word.length();i++) {
33	        	char ch=word.charAt(i);
34	        	if(curr.child.containsKey(ch)) {
35	        		curr=curr.child.get(ch);
36	        	}
37	        	else {
38	        		Node nn=new Node(ch);
39	        		curr.child.put(ch, nn);
40	        		curr=nn;
41	        	}
42	        }
43	        curr.isTerminal = word;
44	    }
45		public void Search(char[][] maze, int i, int j, Node node) {
46			// TODO Auto-generated method stub
47			//backtracking rucurrsion
48			if(i<0 || j<0 || i>=maze.length || j>=maze[0].length || !node.child.containsKey(maze[i][j])) {
49				return;
50			}
51			char ch=maze[i][j];
52			node=node.child.get(ch);
53			if(node.isTerminal!=null) {
54				ll.add(node.isTerminal);
55				node.isTerminal=null;
56			}
57			maze[i][j]='*';
58			Search(maze,i+1,j,node);
59			Search(maze,i-1,j,node);
60			Search(maze,i,j+1,node);
61			Search(maze,i,j-1,node);
62			maze[i][j]=ch;
63		}
64	}
65
66}
67