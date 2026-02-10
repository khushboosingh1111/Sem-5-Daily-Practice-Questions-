// Last updated: 2/10/2026, 10:58:48 AM
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
17    static long ans;
18    static long max;
19    static long mod=1000000007;
20    public int maxProduct(TreeNode root) {
21        max=0;
22        ans=totalsum(root);
23        solve(root);
24        return (int)(max%mod);
25    }
26    public long totalsum(TreeNode root){
27        if(root==null){
28            return 0;
29        }
30        return (long)root.val+totalsum(root.left)+totalsum(root.right);
31    }
32    public long solve(TreeNode root){
33        if(root==null){
34            return 0;
35        }
36        long curr=root.val+solve(root.left)+solve(root.right);
37        max=Math.max(max,curr*(ans-curr));
38        return curr;
39    }
40}