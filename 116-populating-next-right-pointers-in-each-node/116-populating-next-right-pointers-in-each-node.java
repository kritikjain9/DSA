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
        if (root == null) {
            return null;
        }

        Node ptr = root;
        while (ptr != null) {
            Node pt = ptr;
            while (pt != null) {
                if(pt.left != null){
                   pt.left.next = pt.right;                    
                }

                if (pt.next != null && pt.right != null) {
                    pt.right.next = pt.next.left;
                }

                pt = pt.next;
            }
            ptr = ptr.left;
        }
        return root;
    }
}






