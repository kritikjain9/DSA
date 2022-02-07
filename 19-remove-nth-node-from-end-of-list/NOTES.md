**Waapas diagram banake kar is fast and slow approach ko**
```
class Solution {
public ListNode removeNthFromEnd(ListNode head, int n) {
if(head == null || head.next == null)return null;
ListNode dummy = new ListNode(Integer.MIN_VALUE);
dummy.next = head;
ListNode fast = dummy, slow = dummy;
fast = head;
while(n > 0){
fast = fast.next;
n--;
}
while(fast != null){
fast = fast.next;
slow = slow.next;
}
slow.next = slow.next.next;
return dummy.next;
}
}
​
```