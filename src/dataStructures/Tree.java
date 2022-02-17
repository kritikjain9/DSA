package dataStructures;

import java.util.*;

public class Tree {
	
	static class Node {
		int val;
		ArrayList<Node> children;
		
		public Node(int val) {
			this.val = val;
			this.children = new ArrayList<>();
		}
	}
	
	public static Node construct(int[] inp) {
		if(inp.length == 0)return null;
		if(inp.length == 1) {
			Node head = new Node(inp[1]);
			return head;
		}
		
		Node root = new Node(inp[0]);
		Stack<Node> st = new Stack<>();
		st.push(root);
	
		int idx = 1;
		while(st.size() != 0) {
			int val = inp[idx++];		//20
			
			if(val == -1)
				st.pop();
			else {				
				Node parent = st.peek(); 		//10
				
				Node child = new Node(val);
				parent.children.add(child);
				
				st.push(child);
			}
		}
		return root;
	}
	
	public static void traversals(Node node){
	    if(node == null)return;
	    
	    System.out.println("Node Pre " + node.val);
	    
	    for(Node child : node.children){
	        System.out.println("Edge Pre " + node.val + "--" + child.val);
	        traversals(child);
	        System.out.println("Edge Post " + node.val+ "--" + child.val);
	    }
	    
	    System.out.println("Node Post " + node.val);
    }
	
	public static void display(Node root) {
		if(root == null)
			return;
		
		System.out.println(root.val + " ");
		for(Node child : root.children)
			display(child);
	}
	
	public static void main(String[] args) {
		int[] inp = {10, 20 , -1, 30, 50, -1, 60, -1, -1, 40, -1, -1};
		Node root = construct(inp);
//		display(root);
		traversals(root);
	}
	
}
