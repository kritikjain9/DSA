package dataStructures;

public class DoublyLL {
	
	private ListNode head;
	
	 private class ListNode{
		int val;
		ListNode next;
		ListNode prev;
		
		public ListNode(int val) {
			this.val = val;
		}
		
		public ListNode(int val, ListNode next, ListNode prev) {
			this.val = val;
			this.next = next;
			this.prev = prev;
		}
		
	}
	
	public void insertFirst(int val) {
		ListNode node = new ListNode(val);
		node.next = head;
		node.prev = null;
		if(head != null) {
			head.prev = node;
		}
		
		head = node;
	}
	
	public void display() {
		ListNode temp = this.head;
		while(temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
		System.out.println("END");
	}
	
	public void revDisplay() {
		ListNode temp = this.head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		ListNode last = temp;
		System.out.print("START ");
		while(last != null) {
			System.out.print(" -> " + last.val);
			last = last.prev;
		}
	}
	
}
