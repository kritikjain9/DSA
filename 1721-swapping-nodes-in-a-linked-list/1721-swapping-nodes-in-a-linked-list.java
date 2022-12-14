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
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if(head.next == null)
            return head;
        
        int pos = k;
        
        ListNode fwd = head, bwd = head;
        while(pos-- > 0){
            fwd = fwd.next;
        }
        
        while(fwd != null){
            fwd = fwd.next;
            bwd = bwd.next;
        }
        
        ListNode newNode = head;
        while(k-- > 1){
            newNode = newNode.next;
        }
        
        int data = newNode.val;
        newNode.val = bwd.val;
        bwd.val = data;
        
        return head;
    }
}