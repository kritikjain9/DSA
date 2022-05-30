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
        List<List<Integer>> masterList = new ArrayList<>();
        
        if(root == null){
            return masterList;
        }
        
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        
        while(queue.size() > 0){
            List<Integer> list = new ArrayList<>();
            int count = queue.size();
            
            for(int i = 0; i < count; i++){
                Node temp = queue.remove();
                list.add(temp.val);
                
                for(Node child : temp.children){
                    queue.add(child);
                }
            }
            masterList.add(list);
        }
        return masterList;
    }
}







