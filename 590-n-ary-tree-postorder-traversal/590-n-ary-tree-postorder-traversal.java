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
    
    public List<Integer> helper(Node root, List<Integer> res){
        if(root == null)return new ArrayList<>();
        
        for(Node child : root.children){
            helper(child, res);
        }
        
        res.add(root.val);
        return res;        
    }
    
    public List<Integer> postorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> res = helper(root, ans);
        return ans;
    }
}





