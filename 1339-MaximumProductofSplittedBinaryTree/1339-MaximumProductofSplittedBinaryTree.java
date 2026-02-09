// Last updated: 2/9/2026, 12:04:29 PM
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

 /**
 
    Solution 1: 
        Traverse the tree using DFS, as we come up the level, we calculate left subtree sum and right subtree sum. 
        Calculate the max between  ( (left + curr) * (right) ) vs ((right+curr) * (left))
        return the modulo
  */
class Solution {
    long maxValue = 0;
    long totalSum = 0;
    public int maxProduct(TreeNode root) {
        totalSum = totalSum(root);
        traverse(root, totalSum);

        return (int)(maxValue % 1000000007);
    }

    public long totalSum(TreeNode root){
        if(root == null){
            return 0;
        }

        return totalSum(root.left) + root.val + totalSum(root.right);
    }

    public long traverse(TreeNode root, long total){
        if(root == null){
            return 0;
        }

        long subTotal = traverse(root.left, total) + traverse(root.right, total) + root.val;

        long prod = (long)subTotal * (total - subTotal);
        this.maxValue = Math.max(maxValue, prod);
        return subTotal;
    }
}