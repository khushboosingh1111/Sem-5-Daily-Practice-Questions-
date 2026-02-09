// Last updated: 2/9/2026, 12:53:27 PM
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
17    static long total;
18    static long maxAns;
19    public int maxProduct(TreeNode root) {
20        maxAns = 0;
21        total = findSum(root);
22        solve(root);
23        return (int)(maxAns%1000000007);
24    }
25    public long findSum(TreeNode root){
26        if(root==null)return 0;
27        return (long)root.val+findSum(root.left)+findSum(root.right);
28    }
29    public long solve(TreeNode root){
30        if(root==null) return 0;
31        long curr = root.val+solve(root.left)+solve(root.right);
32        maxAns = Math.max(maxAns, curr*(total-curr));
33        return curr;
34}
35}