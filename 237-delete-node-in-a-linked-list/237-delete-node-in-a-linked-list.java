/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        //delete hone waale node me aage waale node ki value dalwali
        node.val = node.next.val;
        
        //ab uss aage waale node ko dereference kar diya 
        node.next = node.next.next;
        
    }
}