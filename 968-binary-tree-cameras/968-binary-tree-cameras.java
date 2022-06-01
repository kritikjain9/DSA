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
    final int CAMERA = 1;
    final int MONITORED = 2;
    final int NOT_MONITORED = 3;

    public int cCount = 0;
    
    public int minCameraCover(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        int count = helper(root);
        if(count == NOT_MONITORED){
            cCount++;
        }
        
        return cCount;
    }
    
    public int helper(TreeNode root){
        if(root == null){
            return MONITORED;
        }
        if(root.left == null && root.right == null){
            return NOT_MONITORED;
        }
        
        int lRes = helper(root.left);
        int rRes = helper(root.right);

        //sabse high precedence non-monitored nodes ki hai
        if(lRes == NOT_MONITORED || rRes == NOT_MONITORED){
            cCount++;
            return CAMERA;
        }
        //uske baad precedence camera waale nodes ki hai        
        else if(lRes == CAMERA || rRes == CAMERA){
            return MONITORED;
        }else{
            return NOT_MONITORED;
        }
    }
    
}


// class Solution {
//     int count = 0;
//     final int CAMERA = 1;
//     final int MONITORED = 2;
//     final int NOT_MONITORED = 3;

//     public int minCameraCover(TreeNode root) {
//      int val = helper(root);

//      if(val == NOT_MONITORED){
//          count++;
//      }
     
//      return count;   
//     }

//     public int helper(TreeNode node){
//         if(node == null){
//             return MONITORED;
//         }

//         int left = helper(node.left);
//         int right = helper(node.right);

//         if(left == NOT_MONITORED || right == NOT_MONITORED){
//             count++;
//             return CAMERA;
//         } else if(left == CAMERA || right == CAMERA){
//             return MONITORED;
//         } else {
//             return NOT_MONITORED;
//         }
//     }
// }









