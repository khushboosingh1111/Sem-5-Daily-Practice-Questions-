// Last updated: 9/2/2025, 10:40:24 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode lcaDeepestLeaves(TreeNode root) {
     return dfs(root).node;
    }
    
    private Pair dfs(TreeNode root) {
        if (root == null) {
            Pair p = new Pair();
            p.node = null;
            p.depth = 0;
            return p;
        }

        Pair left = dfs(root.left);
        Pair right = dfs(root.right);

        Pair result = new Pair();
        if (left.depth > right.depth) {
            result.node = left.node;
            result.depth = left.depth + 1;
        } else if (right.depth > left.depth) {
            result.node = right.node;
            result.depth = right.depth + 1;
        } else {
            result.node = root;
            result.depth = left.depth + 1; // or right.depth + 1 (same)
        }
        return result;
    }
    
    private class Pair {
        TreeNode node;
        int depth;
    }
}