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
    public int maxDepth(TreeNode root) {
        if(root == null)return 0;
        if(root.left == null && root.right == null)
            return 1;
        
        int ht = Integer.MIN_VALUE;
        
        if(root.left != null)
            ht = Math.max(maxDepth(root.left), ht);
        
        
        if(root.right != null)
            ht = Math.max(maxDepth(root.right), ht);
            
        return ht + 1;
    }
}