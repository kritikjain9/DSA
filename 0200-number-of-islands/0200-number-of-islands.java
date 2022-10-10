class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    count++; 
                    dfs(grid, i, j);        
                }
            }
        }
        return count;
    }
    
    public void dfs(char[][] grid, int row, int col){
        grid[row][col] = '0';
        
        //call clockwise to get the connected components
        
        //top
        if(row - 1 >= 0 && grid[row - 1][col] == '1'){
            dfs(grid, row - 1, col);
        }
        
         //right
        if(col + 1 < grid[0].length && grid[row][col + 1] == '1'){
            dfs(grid, row, col + 1);
        }
        
         //down
        if(row + 1 < grid.length && grid[row + 1][col] == '1' ){
            dfs(grid, row + 1, col);
        }
        
         //left
        if(col - 1 >= 0 && grid[row][col - 1] == '1'){
            dfs(grid, row, col - 1);
        }
        
        
    }
    
}