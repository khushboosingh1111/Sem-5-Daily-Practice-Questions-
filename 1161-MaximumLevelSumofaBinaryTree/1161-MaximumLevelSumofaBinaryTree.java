// Last updated: 1/6/2026, 8:50:26 PM
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
17    public int maxLevelSum(TreeNode root) {
18        Queue<TreeNode> q = new LinkedList<>();
19        q.add(root);
20
21        int level = 1;
22        int ansLevel = 1;
23        int maxSum = Integer.MIN_VALUE;
24
25        while (!q.isEmpty()) {
26            int size = q.size();
27            int sum = 0;
28
29            for (int i = 0; i < size; i++) {
30                TreeNode node = q.poll();
31                sum += node.val;
32
33                if (node.left != null) q.add(node.left);
34                if (node.right != null) q.add(node.right);
35            }
36
37            if (sum > maxSum) {
38                maxSum = sum;
39                ansLevel = level;
40            }
41
42            level++;
43        }
44
45        return ansLevel;
46    }
47}