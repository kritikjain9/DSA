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
    public int pairSum(ListNode head) {
        
        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null){
            //Goes till fast is at end of list and slow at mid
            fast = fast.next.next;
            slow = slow.next;
        }
        
        fast = head;
        //Reversing the list after slow pointer
        slow = reverse(slow);
        int max = Integer.MIN_VALUE;
        
        while(slow != null ){
            max = Math.max(max, slow.val + fast.val);
            fast = fast.next;
            slow = slow.next;
        }
        return max;
    }
    ListNode reverse(ListNode node){
        if(node == null || node.next == null)return node;
        
        ListNode rest = reverse(node.next);
        node.next.next = node;
        
        node.next = null;
        return rest;
    }
    
}