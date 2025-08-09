// Last updated: 8/9/2025, 9:55:32 PM
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
    public int maxDepth(TreeNode root) {
        return dep(root,0);
    }
    public int dep(TreeNode root,int d){
        if(root==null){
            return d;
        }
        int lbt=dep(root.left,d+1);
        int rbt=dep(root.right,d+1);
        return Math.max(lbt,rbt);
        

    }
}