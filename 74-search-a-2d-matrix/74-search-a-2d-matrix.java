class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int r = mat.length, c = mat[0].length;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(mat[i][j] == target)
                return true;
            }
            
        }
        return false;
    }
}