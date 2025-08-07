// Last updated: 8/7/2025, 11:30:05 AM
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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        if(root.val<key){
            root.right=deleteNode(root.right,key);
        }
        else if(root.val>key){
            root.left=deleteNode(root.left,key);
        }
        else{
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            // else{ //by right ka minimum
            //     int min=min(root.right);
            //     root.right=deleteNode(root.right,min);
            //     root.val=min;
            // }
            //by left max
            else{
                int max=max(root.left);
                root.left=deleteNode(root.left,max);
                root.val=max;
            }
        }
        return root;
    }
    // public int min(TreeNode root){
    //     if(root==null){
    //         return Integer.MAX_VALUE;
    //     }
    //     int l=min(root.left);
    //     return Math.min(l,root.val);
    // }
    public int max(TreeNode root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int r=max(root.right);
        return Math.max(r,root.val);
    }
}