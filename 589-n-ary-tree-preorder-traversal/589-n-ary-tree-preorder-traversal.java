/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    
    public List<Integer> print(Node root, List<Integer> res){
        if(root == null)return new ArrayList<>();
        
        // System.out.print(root.val);
        res.add(root.val);
        for(Node child : root.children){
            print(child, res);
        }
        return res;
    }
    
    public List<Integer> preorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> res = print(root, ans);
        return ans;
    }
}





