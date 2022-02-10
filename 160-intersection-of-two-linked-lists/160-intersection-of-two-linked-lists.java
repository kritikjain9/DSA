/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        for(ListNode temp = headA; temp != null; temp = temp.next){
            set.add(temp);
        }
        
        for(ListNode temp = headB; temp != null; temp = temp.next){
            if(set.contains(temp))
                return temp;
        }
        return null;
    }
}