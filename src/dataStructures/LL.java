package dataStructures;

public class LL {
	
	public ListNode head;
	
	public class ListNode{
		int val;
		ListNode next;
		
		public ListNode(int val) {
			this.val = val;
		}
		
		public ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	
	public void addFirst(int val) {
		ListNode newNode = new ListNode(val);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;		
		head = newNode;
	}

	public void display() {
		ListNode temp = this.head;
		while(temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
	}
	
//	public ListNode insertFirstRecursive(ListNode head, int idx, ListNode fwdNode, int val) {
//		if(idx == 0) {
//			ListNode added = new ListNode(val);
//			added.next = fwdNode;
//			return added;
//		}
//		
//		head.next = insertFirstRecursive(head, idx-1, head.next, val);
//		return head;
//	}
	
	
	
	
	
	public ListNode insertFirstRecursive(int idx, ListNode curr, int val) {
		if(idx == 0) {
			ListNode added = new ListNode(val);
			added.next = curr;
			return added;
		}
		
		curr.next = insertFirstRecursive(idx-1, curr.next, val);
		return curr;
	}
	
	
	
	
	

}





