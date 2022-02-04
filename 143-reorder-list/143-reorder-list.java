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
    
    public ListNode findMid(ListNode head){
        if(head == null || head.next == null)return head;
        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public ListNode reverse(ListNode node){
        if(node == null || node.next == null)return node;
        
        ListNode prev = null, curr = node, fwd = null;
        while(curr != null){
            fwd = curr.next;
            curr.next = prev;
            
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
    
    public void reorderList(ListNode head){
        
        if(head == null || head.next == null)return;
        
        //pre-processing
        ListNode mid = findMid(head);
        ListNode newHead = mid.next;
        mid.next = null;
        
        newHead = reverse(newHead);
        
        ListNode p1 = head;
        ListNode p2 = newHead;
        
        while(p2 != null){
            ListNode p1OriNext = p1.next;
            ListNode p2OriNext = p2.next;
            
            //processing
            
            p1.next = p2;
            p1 = p1OriNext;
            
            p2.next = p1OriNext;
            p2 = p2OriNext;
        } 
    }  
}



