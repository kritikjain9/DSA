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
    
    public int size(ListNode head){
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        
        k = k % size(head);
        if(k == 0){
            return head;
        }
        
        ListNode dummy = new ListNode();
        dummy.next = head;
        
        ListNode slow = dummy;
        ListNode fast = head;
        
        while(k > 0){
            fast = fast.next;
            k--;
        }
        
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        
        slow = slow.next;
        fast.next = head;
        
        head = slow.next;
        slow.next = null;
        
        
        return head;
    }
}







