// Last updated: 8/13/2025, 11:32:38 AM
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
    int camera=0;
    public int minCameraCover(TreeNode root) {
        int c=minCamera(root);
        if(c==-1){
            camera++;
        }
        return camera;
        
    }   
    public int minCamera(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left=minCamera(root.left);
        int right=minCamera(root.right);
        if(left==-1 || right==-1){ // is node Camera ki need hai
            camera++;
            return 1; //Camera setup kra is node pe
        }
        if(left==1 || right==1){ // inme se koi ek ke pass ya dono k pass Camera hai or ek pass camera h and dusra wala covered hai
            return 0;  //iska mtlb mai covered hu
        }
        else{
            return -1; //need a camera
        }

        
    }                                
}