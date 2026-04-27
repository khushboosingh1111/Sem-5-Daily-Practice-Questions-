// Last updated: 4/27/2026, 10:54:00 PM
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
    static long ans;
    static long max;
    static long mod=1000000007;
    public int maxProduct(TreeNode root) {
        max=0;
        ans=totalsum(root);
        solve(root);
        return (int)(max%mod);
    }
    public long totalsum(TreeNode root){
        if(root==null){
            return 0;
        }
        return (long)root.val+totalsum(root.left)+totalsum(root.right);
    }
    public long solve(TreeNode root){
        if(root==null){
            return 0;
        }
        long curr=root.val+solve(root.left)+solve(root.right);
        max=Math.max(max,curr*(ans-curr));
        return curr;
    }
}