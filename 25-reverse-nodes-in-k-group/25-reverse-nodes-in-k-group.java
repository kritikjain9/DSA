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
        int count = 0;
        for(ListNode temp = head; temp != null; temp = temp.next)
            count++;
        
        return count;
    }
    
    public ListNode oh = null, ot = null, th = null, tt = null;
    
    public void addFirst(ListNode node){
        if(th == null){
            th = node;
            tt = node;
        }
        else{
            node.next = th;
            th = node;
        }
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null)return head;
        
        int count = size(head);
        ListNode curr = head; 
        
        //outer while condition
        while(curr != null && count >= k){
            
            int revCount = k;
            while(revCount > 0){
                ListNode fwd = curr.next;
                curr.next = null;
                addFirst(curr);
                curr = fwd;
                revCount--;
            }
            
            count -= k;
            
            if(oh == null){
                oh = th;
                ot = tt;
            }
            else{
                ot.next = th;
                ot = tt;
            }
            
            th = null;
            tt = null;
            
        }
        
        if(curr != null){
            ot.next = curr;
        }
        return oh;
    }
}



