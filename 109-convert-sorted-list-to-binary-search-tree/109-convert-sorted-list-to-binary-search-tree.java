/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    
    public ListNode middleNode(ListNode head) {
        if(head == null){
            return null;
        }
        
        ListNode dummy = new ListNode();
        dummy.next = head;
        
        ListNode fast = head, slow = dummy;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newMid = slow.next;
        slow.next = null;
        
        return newMid;
    }
    
    public TreeNode sortedListToBST(ListNode head) {
       if(head == null){
           return null;
       }
        if(head.next == null){
            TreeNode base = new TreeNode(head.val);
            return base;
        }
        
        ListNode midNode = middleNode(head);
        TreeNode root = new TreeNode(midNode.val);
        
        root.right = sortedListToBST(midNode.next);
        root.left = sortedListToBST(head);
        return root;
    }
}
    
    
    
    
    
    
     
    
    
    
    