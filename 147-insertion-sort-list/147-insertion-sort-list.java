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
    
     public ListNode findMid(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode prev = null;
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        prev.next = null;       //broke the link
        return slow;            //mid node return kardi for sorting right list
    }
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(Integer.MIN_VALUE);   //just a starting poin
        ListNode temp = dummy;
        
        ListNode p1 = l1;
        ListNode p2 = l2;

        while(p1 != null && p2 != null){
            if(p1.val <= p2.val){
                temp.next = p1;
                p1 = p1.next;
            }
            else{
                temp.next = p2;
                p2 = p2.next;
            }
            temp = temp.next;
        }
        
        temp.next = (p1 == null ? p2 : p1);
        return dummy.next;
    }
    
    
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null)return head;
        
        ListNode mid = findMid(head);
        
        ListNode left = insertionSortList(head);         //head se mid tak ko sort karega
        ListNode right = insertionSortList(mid);           //mid se aage tak ko sort karega
        
            return mergeTwoLists(left, right);
    }
    

}