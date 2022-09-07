class Solution {
    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        int run = 0;
        for(int i = 0; i < nums.length; i++){
            run += nums[i];
            res[i] = run;
        }
        
        return res;
    }
}