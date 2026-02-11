// Last updated: 2/11/2026, 12:29:43 PM
1class Solution {
2    static class Trie {
3        class Node {
4            Node zero;
5            Node one;
6        }
7        private Node root = new Node();
8        public void add(int val) {
9            Node curr = root;
10
11            for (int i = 31; i >= 0; i--) {
12                int bit = val & (1 << i);
13
14                if (bit == 0) {
15                    if (curr.zero != null) {
16                        curr = curr.zero;
17                    } else {
18                        Node nn = new Node();
19                        curr.zero = nn;
20                        curr = nn;
21                    }
22                } else {
23                    if (curr.one != null) {
24                        curr = curr.one;
25                    } else {
26                        Node nn = new Node();
27                        curr.one = nn;
28                        curr = nn;
29                    }
30                }
31            }
32        }
33
34        public int maxXor(int val) {
35            Node curr = root;
36            int ans = 0;
37
38            for (int i = 31; i >= 0; i--) {
39                int bit = val & (1 << i);
40
41                if (bit == 0) {
42                    if (curr.one != null) {
43                        ans = ans | (1 << i);
44                        curr = curr.one;
45                    } else {
46                        curr = curr.zero;
47                    }
48                } else {
49                    if (curr.zero != null) {
50                        ans = ans | (1 << i);
51                        curr = curr.zero;
52                    } else {
53                        curr = curr.one;
54                    }
55                }
56            }
57            return ans;
58        }
59    }
60
61    public int findMaximumXOR(int[] nums) {
62
63        Trie t = new Trie();
64        int max = 0;
65
66        t.add(nums[0]);
67
68        for (int i = 1; i < nums.length; i++) {
69            max = Math.max(max, t.maxXor(nums[i]));
70            t.add(nums[i]);
71        }
72
73        return max;
74    }
75}
76