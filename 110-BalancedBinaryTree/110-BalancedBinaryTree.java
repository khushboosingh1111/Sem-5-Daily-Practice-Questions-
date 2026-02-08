// Last updated: 2/8/2026, 9:52:25 PM
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
17    private boolean result = true;
18    public boolean isBalanced(TreeNode root) {
19    maxDepth(root);
20    return result;
21}
22public int maxDepth(TreeNode root) {
23    if (root == null)
24        return 0;
25    int l = maxDepth(root.left);
26    int r = maxDepth(root.right);
27    if (Math.abs(l - r) > 1)
28        result = false;
29    return 1 + Math.max(l, r);
30    }
31}