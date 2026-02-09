// Last updated: 2/9/2026, 12:04:21 PM
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
17    long mod=1000000007;
18    long ans=0;
19    private long dfs(TreeNode root){
20        if(root==null){
21            return 0;
22        }
23        root.val+=dfs(root.left)+dfs(root.right);
24        return root.val;
25    }
26    public int maxProduct(TreeNode root) {
27        long total=dfs(root);
28        Queue<TreeNode> pq=new LinkedList<>();
29        pq.add(root);
30        while(!pq.isEmpty()){
31            TreeNode nn=pq.poll();
32            if(nn==null){
33                continue;
34            }
35            long currAns=nn.val*(total-nn.val);
36            ans=Math.max(ans,currAns); 
37            if(nn.left!=null){
38                pq.add(nn.left);
39            }
40            if(nn.right!=null){
41                pq.add(nn.right);
42            }           
43        }
44        return (int)(ans%mod);
45    }
46}