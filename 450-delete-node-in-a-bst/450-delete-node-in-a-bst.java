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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return null;
        }
        
    //and then yet again, i rise i rise i rise
        //conditions
        if(root.val < key){
            root.right = deleteNode(root.right, key);
        }
        else if(root.val > key){
            root.left = deleteNode(root.left, key);
        }else{
            //we are on the node to be deleted
            if(root.left == null && root.right == null){
                return null;
            }
            else if(root.left == null){
                return root.right;  
            }
            else if(root.right == null){
                return root.left;  
            }else{
                //****//
                int min = findMin(root.right);
                
                root.val = min;
                root.right = deleteNode(root.right, min);
                
                return root;
            }
        }

        return root;
    }
    
    public int findMin(TreeNode node){
        while(node.left != null){
            node = node.left;
        }
        return node.val;
    }  
    
    // public TreeNode find(TreeNode node, int key){
    //     if(key == node){
    //         return TreeNode;
    //     }else if(key < node.val){
    //         return find(node.left, key);
    //     }else{
    //         return find(node.right, key);
    //     }
    // }
    
}









