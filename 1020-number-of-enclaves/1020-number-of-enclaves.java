class Solution {
    public int numEnclaves(int[][] grid) {
        int enc = 0;
        
        for(int i = 0; i < grid.length; i++){ 
            for(int j = 0; j < grid[0].length; j++){
                if(i == 0 || j == 0 || i == grid.length - 1 || j == grid[0].length - 1){
                    if(grid[i][j] == 1){
                        dfs(grid, i, j);
                    }
                }
            }
        }
        
        for(int i = 0; i < grid.length; i++){ 
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1)
                    enc++;
            }
        }
        
        return enc;
    }
    
    public void dfs(int[][] grid, int r, int c){
        grid[r][c] = 0;
        
        //TRDL
        if(r - 1 >= 0 && grid[r - 1][c] == 1){
            dfs(grid, r - 1, c);
        }
        
        if(c + 1 < grid[0].length && grid[r][c + 1] == 1){
            dfs(grid, r, c + 1);
        }
        
        if(r + 1 < grid.length && grid[r + 1][c] == 1){
            dfs(grid, r + 1, c);
        }
        
        if(c - 1 >= 0 && grid[r][c - 1] == 1){
            dfs(grid, r, c - 1);
        }
        
    }
    
}




