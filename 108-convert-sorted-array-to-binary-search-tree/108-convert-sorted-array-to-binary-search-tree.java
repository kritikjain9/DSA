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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0){
            return null;
        }
        
        int lo = 0, hi = nums.length - 1;
        return getBST(nums, lo, hi);
    }
    
    public TreeNode getBST(int[] nums, int lo, int hi){
        if(lo > hi){
            return null;
        }
        
        if(lo == hi){
            TreeNode newNode = new TreeNode(nums[lo]);
            return newNode;
        }
        
        int mid = lo + (hi - lo)/2;
        TreeNode root = new TreeNode(nums[mid]);
        
        root.left = getBST(nums, lo, mid - 1);
        root.right = getBST(nums, mid + 1, hi);
        
        return root;
    }
}