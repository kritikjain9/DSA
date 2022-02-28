class Solution {
    public int tribonacci(int n) {
        int[] dp = new int[n + 1];
        int res = fibo(n, dp);
        return res;
    }
    
    public int fibo(int n, int[] dp){
        if(n < 2)return n;
        if(n == 2)return 1;
        
        if(dp[n] != 0)return dp[n];
        
        int fnm1 = fibo(n-1, dp);
        int fnm2 = fibo(n-2, dp);
        int fnm3 = fibo(n-3, dp);

        dp[n] = fnm1 + fnm2 + fnm3;    
        return dp[n];
    }
    
}