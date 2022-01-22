class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int cr = mat.length;
        int cc = mat[0].length;
        
        if((cr * cc) != (r * c))
            return mat;
        
        if(cr == r && cc == c)
            return mat;
        
        //main code
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                al.add(mat[i][j]);
            }
        }
        
        //lozic
        int[][] res = new int[r][c];
        int idx = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                res[i][j] = al.get(idx++);
            }
        }
        return res;
    }
}