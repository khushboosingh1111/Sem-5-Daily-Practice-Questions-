// Last updated: 2/10/2026, 3:17:30 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public int maxSumBST(TreeNode root) {
18        return isValid(root).ans;
19    }
20    public bst isValid(TreeNode root){
21        if(root==null){
22            return new bst();
23        }
24        bst lbp=isValid(root.left);
25        bst rbp=isValid(root.right);
26        bst sbp=new bst();
27        sbp.max=Math.max(lbp.max,Math.max(rbp.max,root.val));
28        sbp.min=Math.min(lbp.min,Math.min(rbp.min,root.val));
29        sbp.sum=lbp.sum+rbp.sum+root.val;
30        sbp.isbst=lbp.isbst && rbp.isbst && lbp.max<root.val && rbp.min>root.val;
31        if(sbp.isbst){
32            sbp.ans=Math.max(lbp.ans,Math.max(rbp.ans,sbp.sum));
33        }
34        else{
35            sbp.ans=Math.max(lbp.ans,rbp.ans);
36        }
37        return sbp;
38    }
39    public class bst{
40        boolean isbst=true;
41        long max=Long.MIN_VALUE;
42        long min=Long.MAX_VALUE;
43        int sum=0;
44        int ans=0; //only maximum bst part ka sum
45    } 
46}