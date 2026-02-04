// Last updated: 2/4/2026, 12:34:29 PM
1class Trie {
2    class Node{
3		char ch;
4		boolean isTerminal;
5		HashMap<Character,Node> child;
6		public Node(char ch) {
7			this.ch=ch;
8			child=new HashMap<>();
9		}
10	}
11	private Node root;
12	public Trie() {
13        root=new Node('*'); //new node hoine pr node ka ek object bnega aur uske pass ch hoga aur boolean isterminal hoga jo initially false hoga,aur hashset hoga 0 size ka
14    }
15	public void insert(String word) {
16        Node curr=root;
17        for(int i=0;i<word.length();i++) {
18        	char ch=word.charAt(i);
19        	if(curr.child.containsKey(ch)) {
20        		curr=curr.child.get(ch);
21        	}
22        	else {
23        		Node nn=new Node(ch);
24        		curr.child.put(ch, nn);
25        		curr=nn;
26        	}
27        }
28        curr.isTerminal = true;
29
30    }
31	public boolean search(String word) {
32		Node curr=root;
33        for(int i=0;i<word.length();i++) {
34        	char ch=word.charAt(i);
35        	if(curr.child.containsKey(ch)) {
36        		curr=curr.child.get(ch);
37        	}
38        	else {
39        		return false;
40        	}
41        }
42        return curr.isTerminal;
43    }
44	public boolean startsWith(String prefix) {
45		Node curr=root;
46        for(int i=0;i<prefix.length();i++) {
47        	char ch=prefix.charAt(i);
48        	if(curr.child.containsKey(ch)) {
49        		curr=curr.child.get(ch);
50        	}
51        	else {
52        		return false;
53        	}
54        }
55        return true;
56    }
57}
58
59
60/**
61 * Your Trie object will be instantiated and called as such:
62 * Trie obj = new Trie();
63 * obj.insert(word);
64 * boolean param_2 = obj.search(word);
65 * boolean param_3 = obj.startsWith(prefix);
66 */