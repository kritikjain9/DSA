class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length, m = mat[0].length;
        if (r*c != n*m) return mat;
        int[][] res = new int[r][c];
        
        for(int itr = 0; itr < r * c; itr++){
            res[itr/c][itr%c] = mat[itr/m][itr%m];
        }
        return res;
    }
}