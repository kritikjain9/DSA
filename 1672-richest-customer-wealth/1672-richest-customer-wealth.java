class Solution {
    public int maximumWealth(int[][] grid) {
        int maxWealth = Integer.MIN_VALUE;
        
        for(int i = 0; i < grid.length; i++){
            int wealth = 0;
            for(int j = 0; j < grid[0].length; j++){
                wealth += grid[i][j];
            }
            if(wealth > maxWealth)
                maxWealth = wealth;
        }
        return maxWealth;
    }
}