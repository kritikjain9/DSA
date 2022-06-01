
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
    
    public List<Integer> res = new ArrayList<>();    
    
   public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return res;
        }
        
        res.add(root.val);
        
        if(root.left != null){
            preorderTraversal(root.left);
        }
        
        if(root.right != null){
            preorderTraversal(root.right);
        }
        
        // System.out.print(root.val + " ");
        
        return res;
    }
}