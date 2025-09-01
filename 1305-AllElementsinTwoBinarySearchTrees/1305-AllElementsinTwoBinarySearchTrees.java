// Last updated: 9/1/2025, 11:09:24 PM
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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // Step 1: Fill PQ with elements of both trees
        fillPQ(root1, pq);
        fillPQ(root2, pq);
        
        // Step 2: Extract from PQ into result list
        List<Integer> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }
        
        return result;
    }
    
    private void fillPQ(TreeNode root, PriorityQueue<Integer> pq) {
        if (root == null) return;
        pq.offer(root.val);
        fillPQ(root.left, pq);
        fillPQ(root.right, pq);
    }
}