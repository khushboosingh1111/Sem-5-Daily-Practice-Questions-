// Last updated: 8/21/2025, 11:47:33 PM
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
    public boolean isCompleteTree(TreeNode root) {
        if (root == null) return true;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean seenNull = false;

        while (!q.isEmpty()) {
            TreeNode node = q.poll();

            if (node == null) {
                seenNull = true;
            } else {
                if (seenNull) {
                    return false;
                }
                q.add(node.left);
                q.add(node.right);
            }
        }
        return true;
    }
}