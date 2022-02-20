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
        
        if(root.left != null){
            int leftRes = maxDepth(root.left);
            ht = Math.max(leftRes, ht);
        }
        
        if(root.right != null){
            int rightRes = maxDepth(root.right);
            ht = Math.max(rightRes, ht);
        }
            
        // ht = Math.max(leftRes, rightRes);
        return ht + 1;
    }
}