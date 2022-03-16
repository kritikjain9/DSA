class Solution {
    public List<Integer> getRow(int rowIndex) {
        int n = rowIndex + 1;
        int dp[][] = new int[n][n];
        
        for(int i = 0; i < n; i++){
            dp[i][0] = 1;
        }
        
        for(int i = 1; i < n; i++){
            for(int j = 1; j < n; j++){
                dp[i][j] = dp[i-1][j] + dp[i-1][j-1];
            }
        }
        
        List<Integer> res = new ArrayList<>();
        for(int j = 0; j < n; j++){
            res.add(dp[rowIndex][j]);
        }
        
        return res;
    }
}