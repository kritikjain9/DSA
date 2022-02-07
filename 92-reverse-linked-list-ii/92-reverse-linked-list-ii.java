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
    
    public ListNode getAt(ListNode head, int idx){
        if(idx < 1)return null;
        if(idx == 1)return head;
        
        ListNode temp = head;
        while(idx > 1){
            temp = temp.next;
            idx--;
        }
        return temp;
    }
    
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null)return head;
        
        while(left < right){
        ListNode leftNode = getAt(head, left);
        ListNode rightNode = getAt(head, right);
            
            int temp = leftNode.val;
            leftNode.val = rightNode.val;
            rightNode.val = temp;
            left++; right--;
        }
    return head;
    }
}




