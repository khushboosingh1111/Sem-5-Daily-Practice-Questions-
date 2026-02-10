// Last updated: 2/10/2026, 12:07:29 PM
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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null) return true;
        q.offer(root);
        int ind=0;
        int prev;
        while(!q.isEmpty()){
            if(ind%2==0){
                prev=Integer.MIN_VALUE;
            }
            else prev=Integer.MAX_VALUE;
            int sz=q.size();
            for(int i=0;i<sz;i++){
                TreeNode cur=q.poll();
                if(ind%2==0){
                    if(cur.val%2==0 || cur.val<=prev) return false;
                }
                if(ind%2!=0){
                    if(cur.val%2!=0 || cur.val>=prev) return false;
                }
                if(cur.left!=null)q.add(cur.left);
                if(cur.right!=null)q.add(cur.right);
                prev=cur.val;
            }
            ind++;
        }
        return true;
    }
}