class Solution {
    public int maxRotateFunction(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return 0;
        }
        
        int n = nums.length;
        
        int fLast = 0, sum = 0;
        for(int i = 0; i < n; i++){
            fLast += i * nums[i];
            sum += nums[i];
        }
        
        //fLast = f(0)
        //formunla
        int maxSum = fLast;
        
        for(int i = 1; i < n; i++){
            int fn = fLast + sum - n * nums[n - i];
            maxSum = Math.max(maxSum, fn);
            fLast = fn;
        }
        
        return maxSum;
        
    }
}












