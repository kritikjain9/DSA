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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        
        
        TreeNode root = construct(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1, map);
        return root;
    }
    
    
    public TreeNode construct(int[] preorder, int[] inorder, int preStart, int preEnd, int inStart, int inEnd, HashMap<Integer, Integer> map){
        if(preStart > preEnd || inStart > inEnd){
            return null; 
        }
        
        TreeNode root = new TreeNode(preorder[preStart]);
        
        int rootIdx = map.get(preorder[preStart]);
        // int leftNodes = rootIdx - 1;
        int leftNodes = rootIdx - inStart;
        
        root.left = construct(preorder, inorder, (preStart + 1), (preStart + leftNodes), inStart, rootIdx - 1, map);
        root.right = construct(preorder, inorder, (preStart + leftNodes + 1), (preEnd), rootIdx + 1, inEnd, map);

        return root;
    }
    
}



