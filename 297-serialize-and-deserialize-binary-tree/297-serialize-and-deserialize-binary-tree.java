/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    
   public class Pair{
        TreeNode node;
        int state;
        
        Pair(){}
        
        Pair(TreeNode node, int state){
            this.node = node;
            this.state = state;
        }
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null){
            return "";
        }
        
        StringBuilder sb = new StringBuilder();
        helper(root, sb);
        return sb.toString();
    }
    
    public void helper(TreeNode root, StringBuilder sb){
        if(root == null){
            sb.append(".");
            sb.append(" ");
            return;
        }
        
        sb.append(root.val);
        sb.append(" ");
        
        helper(root.left, sb);
        helper(root.right, sb);
    }
    
     

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length() == 0){
            return null;
        }
        
        String[] dArr = data.split(" ");
        Stack<Pair> st = new Stack<>();
        
        int rootVal = Integer.parseInt(dArr[0]);
        TreeNode rootNode = new TreeNode(rootVal);
        Pair rootPair = new Pair();
        rootPair.node = rootNode;
        st.push(rootPair);
        
        int idx = 0;
        while(st.size() != 0){
            Pair currPair = st.peek();
            
            if(currPair.state == 0){
                idx++;
                currPair.state++;
                
                if(!dArr[idx].equals(".")){
                    Pair leftPair = new Pair();
                    leftPair.node = new TreeNode(Integer.parseInt(dArr[idx]));
                    currPair.node.left = leftPair.node;
                    st.push(leftPair);
                }
                
            }
            else if(currPair.state == 1){
                idx++;
                currPair.state++;
                
                if(!dArr[idx].equals(".")){
                    Pair rightPair = new Pair();
                    rightPair.node = new TreeNode(Integer.parseInt(dArr[idx]));
                    currPair.node.right = rightPair.node;
                    st.push(rightPair);
                }
            }else {
                st.pop();
            }
        }
    return rootNode;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));















