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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        ArrayList<Integer> res = new ArrayList<>();
        TreeNode curr = root;
        
        while(curr != null){
            if(curr.left == null){
                res.add(curr.val);
                curr = curr.right;
            }
            else{
                TreeNode iop = getIOP(curr);
                //conditions
                if(iop.right == null){
                    iop.right = curr;
                    curr = curr.left;
                }else{
                    res.add(curr.val);
                    curr = curr.right;
                    iop.right = null;
                }
            }
        }
        
        return res;
    }
    
    private TreeNode getIOP(TreeNode node){
        TreeNode temp = node.left;
        while(temp.right != null && temp.right != node){
            temp = temp.right;
        }
        
        return temp;
    }
    
}