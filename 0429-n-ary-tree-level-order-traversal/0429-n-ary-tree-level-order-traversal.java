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
    public List<List<Integer>> levelOrder(Node root) {
        if(root == null){
            return new ArrayList<>();
        }
        
        List<List<Integer>> res = new ArrayList<>();
        
        Queue<Node> primary = new ArrayDeque();
        Queue<Node> secondary = new ArrayDeque();
        primary.add(root);
        
        List<Integer> innerList = new ArrayList<>();
        
        while(primary.size() > 0){
            //1: Remove
            Node removed = primary.remove();
            
            
            //2: Process 
            System.out.print(removed.val + " ");
            innerList.add(removed.val);
            
            
            //3: Add
            for(Node child : removed.children){
                secondary.add(child);
            }
            
            if(primary.size() == 0){
                System.out.println();
                res.add(innerList);
                innerList = new ArrayList<>();
                
                Queue temp = primary;
                primary = secondary;
                secondary = temp;
            }
            
        }
        
        return res;
    }
}