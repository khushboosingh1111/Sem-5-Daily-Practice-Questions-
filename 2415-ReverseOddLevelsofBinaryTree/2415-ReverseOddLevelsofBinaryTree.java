// Last updated: 2/10/2026, 12:05:35 PM
1public class Solution {
2    private List<Integer> prev = new ArrayList<>();
3
4    public boolean isEvenOddTree(TreeNode root) {
5        TreeNode current = root;
6        return dfs(current, 0);
7    }
8
9    private boolean dfs(TreeNode current, int level) {
10        // Base case, an empty tree is Even-Odd
11        if (current == null) {
12            return true;
13        }
14
15        // Compare the parity of current and level
16        if (current.val % 2 == level % 2) {
17            return false;
18        }
19
20        // Add a new level to prev if we've reached a new level
21        while (prev.size() <= level) {
22            prev.add(0);
23        }
24
25        // If there are previous nodes on this level, check increasing/decreasing
26        // If on an even level, check that current's value is greater than the previous on this level
27        // If on an odd level, check that current's value is less than the previous on this level
28        if (prev.get(level) != 0 && 
29                ((level % 2 == 0 && current.val <= prev.get(level)) || 
30                 (level % 2 == 1 && current.val >= prev.get(level)))) {
31            return false;
32        }
33
34        // Add current value to prev at index level
35        prev.set(level, current.val);
36
37        // Recursively call DFS on the left and right children
38        return dfs(current.left, level + 1) && dfs(current.right, level + 1);
39    }
40}
41