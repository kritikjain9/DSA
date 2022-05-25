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
    public HashMap<Integer, Integer> map = new HashMap<>();

    public void buildHM(int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        buildHM(inorder);
        return construct(inorder, postorder, 0, postorder.length - 1, 0, inorder.length - 1);
    }

    public TreeNode construct(int[] inorder, int[] postorder, int pL, int pH, int iL, int iH){
        if(pL > pH || iL > iH){
            return null;
        }
        
        TreeNode root = new TreeNode(postorder[pH]);
        int pos = map.get(postorder[pH]);
        int lSize = pos - iL;
        int rSize = iH - pos;
        
        root.left = construct(inorder, postorder, pL, pH - rSize - 1, iL, pos - 1);
        root.right = construct(inorder, postorder, pL + lSize, pH - 1, pos + 1, iH);
        
        return root;
    }
}

                              
                   
                              
                              
                              
                              
                              
                              
                              
                              