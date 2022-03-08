class Solution {
  
    
    public int findTargetSumWays(int[] nums, int target) {
        
        helper(nums, target, 0, 0);
        
        return count;
    }
    
    int count = 0;
    
    public void helper(int[] arr, int tar, int currSum, int i){
        if(i == arr.length){
            if(currSum == tar){
                count++;
            }
            return;
        }
        
        
        // int addition = helper(arr, tar, currSum + arr[i], idx + 1, count);
        // int sub = helper(arr, tar, currSum - arr[i], idx + 1, count);
        
        helper(arr, tar, currSum + arr[i], i + 1);
        helper(arr, tar, currSum - arr[i], i + 1);

    }
}