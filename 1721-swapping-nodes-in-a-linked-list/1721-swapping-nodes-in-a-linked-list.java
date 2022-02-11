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
        if(head == null || head.next == null)return head;
        
        ListNode pre = head, slow = head;
        while(k > 1){
            pre = pre.next;
            k--;
        }
        
        ListNode kStart = pre;
        
        while(pre.next != null){
            pre = pre.next;
            slow = slow.next;
        }
        
        ListNode kEnd = slow;
        
        int temp = kStart.val;
        kStart.val = kEnd.val;
        kEnd.val = temp;
        
        return head;
    }
}