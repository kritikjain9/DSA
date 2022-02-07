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
        
        if(head == null)return 0;
        if(head.next == null)return 1;
 
        int res = 0;
        
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            res++;
        }
        
        return res;
    }
    
    public void removeAtIdx(ListNode head, int idx){
        ListNode temp = head, prev = head;
        
        while(idx > 0){
            prev = temp;
            temp = temp.next;
            idx--;
        }
        
        // if(prev.next != null)
            prev.next = prev.next.next;
    }
    
    public void removeFirst(ListNode head){
      
        ListNode fwd = head.next;
        head.next = null;
        head = fwd;
    }
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null)return null;
        
        int len = size(head);
        // System.out.println(len);
        if(n == len){
            return head.next;
        }else if(n == 0){
            removeAtIdx(head, len - 1);
        }
        else{
            removeAtIdx(head, (len - n));
        }
        
        return head;
    }
}