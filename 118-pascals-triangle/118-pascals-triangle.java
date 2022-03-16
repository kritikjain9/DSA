class Solution {
    public List<List<Integer>> generate(int numRows) {
        int[][] dp = new int[numRows][numRows];
        
        for(int i = 0; i < numRows; i++){
            dp[i][0] = 1;
        }
        
        // for(int i = 1; i < numRows; i++){
        //     for(int j = 1; j < numRows; j++){
        //         if(i == j){
        //             dp[i][j] = 1;
        //         }
        //     }
        // }
        
        for(int i = 1; i < numRows; i++){
            for(int j = 1; j < numRows; j++){
                dp[i][j] = dp[i-1][j] + dp[i-1][j-1];
            }
        }
        
        // for(int i = 0; i < numRows; i++){
        //     for(int j = 0; j < numRows; j++){
        //         System.out.print(dp[i][j] + " ");
        //     }            
        //     System.out.println();
        // }
        
        // List<List<Integer>> master = new ArrayList<ArrayList<Integer>>();
        List<List<Integer>> master = new ArrayList();

        for(int i = 0; i < numRows; i++){
            // ArrayList<Integer> rowList = new ArrayList<>();
            List<Integer> rowList = new ArrayList<Integer>();
            for(int j = 0; j < numRows; j++){
                if(dp[i][j] != 0){
                    rowList.add(dp[i][j]);
                }
            }
            master.add(rowList);
        }
        return master;
    }
}