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
    public List<List<Integer>> levelOrder(TreeNode node) {
        List<List<Integer>> masterList = new ArrayList<>();
        if(node == null){
            return masterList;   
        }
        
        Queue<TreeNode> qu = new ArrayDeque<>();
        qu.add(node);

        while(qu.size() > 0){
            int process = qu.size();
            List<Integer> currList = new ArrayList<>();
            
            for(int i = 0; i < process; i++){
                TreeNode temp = qu.remove();
                // System.out.print(temp.data + " ");
                currList.add(temp.val);

                if(temp.left != null){
                    qu.add(temp.left);
                }

                if(temp.right != null){
                    qu.add(temp.right);
                }
            }
            // System.out.println();
            masterList.add(currList);
        }
        
        return masterList;
    }
}