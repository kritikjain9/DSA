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
    public HashMap<Integer, Integer> map = new HashMap<>(); //Value -> index

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        fillHM(inorder);
        return construct(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    public void fillHM(int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
    }

    public TreeNode construct(int[] preorder, int[] inorder, int pL, int pH, int iL, int iH) {
        if(pL > pH || iL > iH){
            return null;
        }
        
        TreeNode root = new TreeNode(preorder[pL]);
        int pos = map.get(preorder[pL]);
        int leftSize = pos - iL;
        int rightSize = iH - pos;
        
        root.left = construct(preorder, inorder, pL+1, pL + leftSize, iL, pos - 1);
        root.right = construct(preorder, inorder, pL + leftSize + 1, pH, pos + 1, iH);
        
        return root;
    }
}






