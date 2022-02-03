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
    static ListNode left;
    
    public boolean isPalindrome(ListNode head) {
        left = head;
        
        boolean res = isPalindromeHelper(head);
        return res;
    }
    
    public boolean isPalindromeHelper(ListNode right){
        if(right == null)return true;        //abhi maanke chalo ki true hai
        
        boolean res = isPalindromeHelper(right.next);
        if(res == false)
            return false;
        else{
            if(right.val != left.val){
                return false;
            }
            else{
                left = left.next;
            }
        }
        return res;
    }
    
}