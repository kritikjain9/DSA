class Solution {
    public int maxRes = Integer.MIN_VALUE;
    public int maxArea(int[] heights) {
        if(heights.length == 0){
            return 0;
        }
        int left = 0, right = heights.length - 1;
        while(left != right){
            int wallA = heights[left];
            int wallB = heights[right];
            
            int currArea = Math.min(wallA, wallB) * (right - left);
            
            maxRes = Math.max(maxRes, currArea);
            
            
            if(wallA > wallB){
                right--;
            }
            else if(wallA < wallB){
                left++;
            }else{
                left++;
            }
        }
        
        
        return maxRes;
    }
}