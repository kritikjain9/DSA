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
    
    public static ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        
        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(-1);
        ListNode oddTail = odd, evenTail = even;
        
        ListNode curr = head;
        boolean flag = true;
        while(curr != null){
            if(flag){
                oddTail.next = curr;
                oddTail = curr;  
            }else{
                evenTail.next = curr;
                evenTail = curr;
            }
            flag = !flag;
            curr = curr.next;
        }
        
        evenTail.next = null;
        oddTail.next = even.next;
        return odd.next;
    }
    
//     public ListNode oddEvenList(ListNode head) {
//         if(head == null || head.next == null)
//             return head;
        
//         ListNode p1, p2;
//         p1 = head;
//         p2 = head.next;
        
//         ListNode newHead = p1;
//         ListNode newNext = p2;
        
//         //processing
//         while(p1.next != null && p1.next.next != null){
//             p1.next = p1.next.next;
//             p1 = p1.next;
//         }
//         p1.next = null;
        
//         while(p2.next != null && p2.next.next != null){
//             p2.next = p2.next.next;
//             p2 = p2.next;
//         }
//         p2.next = null;
        
//         p1.next = newNext;
//         return newHead;
        
//     }
}