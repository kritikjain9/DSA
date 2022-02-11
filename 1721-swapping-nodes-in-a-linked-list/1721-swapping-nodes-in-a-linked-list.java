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
    
    public ListNode findKthEnd(ListNode head, int k){
        ListNode slow = head, fast = head;
        while(k > 1){
            fast = fast.next;
            k--;
        }
        
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
    
    public ListNode findKthStart(ListNode head, int k){
        ListNode pre = head;
        while(k > 1){
            pre = pre.next;
            k--;
        }
        return pre;
    }
    
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null || head.next == null)return head;
        
        ListNode kthFromStart = findKthStart(head, k);
        ListNode kthFromEnd = findKthEnd(head, k);
        
        int temp = kthFromStart.val;
        kthFromStart.val = kthFromEnd.val;
        kthFromEnd.val = temp;
        
        return head;
    }
}