// Last updated: 9/6/2025, 11:23:12 PM
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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return createTree(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
    }

    public TreeNode createTree(int[] in, int[] post, int ilo, int ihi, int plo, int phi) {
        if (ilo > ihi || plo > phi) {
            return null;
        }

        // root is last element in postorder
        TreeNode node = new TreeNode(post[phi]);

        // find root index in inorder
        int idx = search(in, ilo, ihi, post[phi]);
        int count = idx - ilo; // left subtree size

        // left subtree
        node.left = createTree(in, post, ilo, idx - 1, plo, plo + count - 1);

        // right subtree
        node.right = createTree(in, post, idx + 1, ihi, plo + count, phi - 1);

        return node;
    }

    public int search(int[] in, int ilo, int ihi, int item) {
        for (int i = ilo; i <= ihi; i++) {
            if (in[i] == item) {
                return i;
            }
        }
        return -1;
    }
}