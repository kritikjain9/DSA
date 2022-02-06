/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)return false;

        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast)
                return true;   
        }
        
        return false;
    }
    
//     public boolean hasCycle(ListNode head) {
//         if(head == null || head.next == null)return false;

//         HashSet<ListNode> hs = new HashSet<>();
        
//         ListNode temp = head;
//         while(temp != null){
//             if(hs.contains(temp))
//                 return true;
            
//                 hs.add(temp);
//             temp = temp.next;
//         }
//         return false;
}