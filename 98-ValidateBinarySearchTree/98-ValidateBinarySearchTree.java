// Last updated: 8/6/2025, 10:17:00 AM
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
        return isValidBST(root,Long.MAX_VALUE,Long.MIN_VALUE);
    }

    public boolean isValidBST(TreeNode node,long rightVal,long leftVal){
        if(node == null){return true;}

        if((leftVal >= node.val || rightVal <= node.val )){
                return false;
        }else{
                return isValidBST(node.left,node.val,leftVal) && 
        isValidBST(node.right,rightVal,node.val);
        }

    
    }
}