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

        ListNode slow = head;
        ListNode fast = head;
        
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
    
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)return true;
        
        ListNode mid = findMid(head);
        ListNode nHead = mid.next;
        
        //link break kardi
        mid.next = null;
        
        nHead = reverse(nHead);
        
        ListNode p1 = head;
        ListNode p2 = nHead;
        
        boolean res = true;
        while(p2 != null){
            if(p1.val != p2.val)
                res = false;
            
            p1 = p1.next;
            p2 = p2.next;
        }
        
        nHead = reverse(nHead);
        mid.next = nHead;
        
        return res;
    }
}