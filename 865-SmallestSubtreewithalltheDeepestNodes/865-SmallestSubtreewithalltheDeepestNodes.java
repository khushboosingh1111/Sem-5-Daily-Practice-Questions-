// Last updated: 1/9/2026, 9:35:13 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public TreeNode subtreeWithAllDeepest(TreeNode root) {
18        return dfs(root).node;
19    }
20    class Result {
21        int height;
22        TreeNode node;
23        Result(int h, TreeNode n) {
24            height = h;
25            node = n;
26        }
27    }
28
29    private Result dfs(TreeNode node) {
30        if (node == null) return new Result(0, null);
31        
32        Result left = dfs(node.left);
33        Result right = dfs(node.right);
34        
35        if (left.height > right.height) {
36            return new Result(left.height + 1, left.node);
37        } else if (right.height > left.height) {
38            return new Result(right.height + 1, right.node);
39        } else {
40            return new Result(left.height + 1, node);
41        }
42    }
43}