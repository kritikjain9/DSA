class Solution {
    public int climbStairs(int n) {
        if(n < 2)return n;
        
        int[] dp = new int[n + 1];
        
        int res = helper(n, dp);
        return res;
    }
    
    public int helper(int n, int[] dp){
         //if we are on the base of the staricase, that means we have found a way
        if(n == 0)return 1;
        
        //if we are in the basement, that means we have done something wrong and its not a way, therefore
        if(n < 0)return 0;
        
        if(dp[n] != 0)return dp[n];
        
        int nm1 = helper(n - 1, dp);
        int nm2 = helper(n - 2, dp);
        
        dp[n] = nm1 + nm2;
        return dp[n];
    }
    
}



// class Solution {
//     public int climbStairs(int n) {
        //if we are on the base of the staricase, that means we have found a way
//         if(n == 0)return 1;
        
//         //if we are in the basement, that means we have done something wrong and its not a way, therefore
//         if(n < 0)return 0;
        
//         int nm1 = climbStairs(n - 1);
//         int nm2 = climbStairs(n - 2);
        
//         return nm1 + nm2;
        
//     }
// }