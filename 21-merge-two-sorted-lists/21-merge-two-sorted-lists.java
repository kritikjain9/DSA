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


//beautiful solution, but not recommended in real life
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)return l2;
        else if(l2 == null)return l1;
        
        ListNode pointer;
        if(l1.val <= l2.val){
            pointer = l1;
            pointer.next = mergeTwoLists(l1.next, l2);
        }
        else{
            pointer = l2;
            pointer.next = mergeTwoLists(l1, l2.next);
        }
        
        return pointer;
    }
}