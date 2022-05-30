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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<ArrayList<Integer>> master = new ArrayList<>();
          ArrayList<Integer> res = new ArrayList<>();
          if(root == null){
              return res;
          }
      
        Queue<TreeNode> qu = new ArrayDeque<>();
        qu.add(root);

    while(qu.size() > 0){
        ArrayList<Integer> list = new ArrayList<>();
        int count = qu.size();
        for(int i = 0; i < count; i++){
            TreeNode temp = qu.remove();
            list.add(temp.val);
            
            if(temp.left != null){
                qu.add(temp.left);
            }
            
            if(temp.right != null){
                qu.add(temp.right);
            }
        }
        master.add(list);
    }
    
        for(int i = 0; i < master.size(); i++){
            ArrayList<Integer> curr = master.get(i);
            res.add(curr.get(curr.size() - 1));
        }
      
    return res;
    }
}