/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null){
            return null;
        }       
        
        Node ptr = root;
        Node head = null;
        Node tail = null;
        
        while(ptr != null){
            
            while(ptr != null){
                //left ka kaam
                if(ptr.left != null){
                    //agar head null hai, iska matlab LL ban-ne ka kaam nahi shuru hua hai
                    if(head == null){
                        head = tail = ptr.left;
                    }
                    //agar head null nahi hai, iska matlab LL ban-ne ka kaam shuru ho chuka hai                 
                    else{
                        tail.next = ptr.left;
                        tail = tail.next;
                    }
                }
                //right ka kaam
                if(ptr.right != null){
                    if(head == null){
                        head = tail = ptr.right;
                    }else{
                        tail.next = ptr.right;
                        tail = tail.next;
                    }
                }
                ptr = ptr.next;
            }
            //ptr, right se null ho jaega. Now we will move down
            ptr = head;            
            head = null;
            tail = null;
        }
        return root;
    }
}









