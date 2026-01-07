// Last updated: 1/7/2026, 11:26:44 PM
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
18        Queue<TreeNode> queue = new LinkedList<>();
19        int max = root.val;
20        queue.offer(root);
21        int maxLevel = 1;
22        int currentLevel = 1;
23        while(!queue.isEmpty()){
24            int queueSize = queue.size();
25            int sum = 0;
26            for(int i=0;i<queueSize;i++){
27                TreeNode val = queue.poll();
28                if(val.left!=null){
29                    queue.offer(val.left);
30                }
31                if(val.right!=null){
32                    queue.offer(val.right);
33                }
34                sum+= val.val;
35            }
36            if(sum>max){
37                max = sum;
38                maxLevel = currentLevel;
39            }
40            currentLevel++;
41        }
42        return maxLevel;
43    }
44}