// Last updated: 8/7/2025, 11:49:15 AM
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
    public boolean isValidBST(TreeNode root) {
        return isValid(root).isvalid;
    }
    public bst isValid(TreeNode root){
        if(root==null){
            return new bst();
        }
        bst lbp=isValid(root.left);
        bst rbp=isValid(root.right);
        bst sbp=new bst();
        sbp.max=Math.max(lbp.max,Math.max(rbp.max,root.val));
        sbp.min=Math.min(lbp.min,Math.min(rbp.min,root.val));
        sbp.isvalid=lbp.isvalid && rbp.isvalid && lbp.max<root.val && rbp.min>root.val;
        return sbp;
    }
    public class bst{
        boolean isvalid=true;
        long max=Long.MIN_VALUE;
        long min=Long.MAX_VALUE;
    } 
}