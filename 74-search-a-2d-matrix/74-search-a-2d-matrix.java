class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int r = mat.length, c = mat[0].length;
        for(int i = 0; i < r * c; i++){
            if(mat[i/c][i%c] == target)
                return true;
        }
        return false;
    }
}