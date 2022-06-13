class Solution {
    public int numIslands(char[][] grid) {
        int gridLen = grid.length;
        int gridWidth = grid[0].length;
        
        boolean[][] visited = new boolean[gridLen][gridWidth];
        
        int count = 0;
        for(int i = 0; i < gridLen; i++){
            for(int j = 0; j < gridWidth; j++){
                
                if(grid[i][j] == '1' && visited[i][j] == false){
                    count++;
                    //traverse ka kaam bas itna hai ki wo saare connected comps ko true mark karke aa jaega
                    traverse(grid, visited, i, j);
                }
                
            }
        }
    return count;
    }
    
    public void traverse(char[][] grid, boolean [][] vis, int i, int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length){
            return;
        }else if(grid[i][j] == '0'){
            return;
        }else if(vis[i][j] == true){
            return;
        }
        
        vis[i][j] = true;
        traverse(grid, vis, i - 1, j);
        traverse(grid, vis, i, j - 1);
        traverse(grid, vis, i + 1, j);
        traverse(grid, vis, i, j + 1);

    }
    
    
}