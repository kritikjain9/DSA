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
        List<Integer> master = new ArrayList<>();
        
        if(root == null){
            return master;
        }
        
        TreeNode temp = root;
        
        while(temp != null){
            //left side
            if(temp.left == null){
                master.add(temp.val);
                temp = temp.right;
            }
            else{
                TreeNode iop = temp.left;       //maan liya
                while(iop.right != null && iop.right != temp){
                    iop = iop.right;
                }
                
                //yahaan pe check karna hai ki pehli baar aa rahe hain ya nahi
                if(iop.right == null){
                    iop.right = temp;
                    temp = temp.left;
                }else{
                    //iop.right == temp -> already processed
                    iop.right = null;
                    master.add(temp.val);
                    temp = temp.right;
                }
                
            }
            
            //right side
        }
        return master;
    }
}












