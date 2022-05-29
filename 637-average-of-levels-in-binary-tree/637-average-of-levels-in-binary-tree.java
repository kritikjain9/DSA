/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public double round (double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
    }
    
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        
        Queue<TreeNode> qu = new ArrayDeque<>();
        qu.add(root);
        
        while(qu.size() > 0){
            int count = qu.size();
            double sum = 0.0;
            for(int i = 0; i < count; i++){
                TreeNode rem = qu.remove();
                sum += rem.val;
                
                if(rem.left != null){
                        qu.add(rem.left);
                    }
                    if(rem.right != null){
                        qu.add(rem.right);
                    }
            }
            // double avg = round((sum / count), 1);
            double avg = ((double)sum / count);
            list.add(avg);
        }
        return list;
    }
}












