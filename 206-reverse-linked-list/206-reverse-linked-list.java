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
    
    ListNode th = null;
    ListNode tt = null;

    public void addFirst(ListNode node){
        if(th == null){
            th = node;
            tt = node;
        }else{
            node.next = th;
            th = node;
        }
    }
    
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)return head;
        
        ListNode curr = head;
        while(curr != null){
            ListNode fwd = curr.next;
            curr.next = null;
            addFirst(curr);
            curr = fwd;
        }
        return th;
    }
}