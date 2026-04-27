// Last updated: 4/27/2026, 10:53:32 PM
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
    private List<Integer> prev=new ArrayList<>();// to store previous value of each level
    public boolean isEvenOddTree(TreeNode root) {
        TreeNode node1=root;
        return dfs(node1,0);
    }
    private boolean dfs(TreeNode node1,int level){
        if(node1==null){
            return true;
        }
        if(node1.val%2==level%2){
            return false;
        }
        while(prev.size()<=level){
            prev.add(0);
        }
        if(prev.get(level)!=0 && ((level%2==0 && node1.val<=prev.get(level)) || (level%2==1 && node1.val>=prev.get(level)))){
            return false;
        }
        prev.set(level,node1.val);
        return dfs(node1.left,level+1) && dfs(node1.right,level+1);
    }
}