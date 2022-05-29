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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> masterList = new ArrayList<>();
        if(root == null)
            return masterList;
        
        
        TreeNode dummy = new TreeNode(Integer.MIN_VALUE);
        Queue<TreeNode> queue = new ArrayDeque();
        queue.add(root);
        
        while(queue.size() > 0){
            List<Integer> list = new ArrayList<>();
            
            int count = queue.size();
            
            for(int i = 0; i < count; i++){
                TreeNode rem = queue.remove();
                list.add(rem.val);       
                    if(rem.left != null){
                        queue.add(rem.left);
                    }
                    if(rem.right != null){
                        queue.add(rem.right);
                    }
              }
            masterList.add(list);
        }
        Collections.reverse(masterList);
        return masterList;
    }
}