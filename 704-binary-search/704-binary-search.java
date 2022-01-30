class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 1 && nums[0] != target)
            return -1;
        
        int res = helper(nums, target, 0, nums.length - 1);
        return res;
    }
    
    public static int helper(int[] arr, int tar, int st, int end){
        if(st > end){
            return -1;
        }
        
            int mid = st + (end - st) / 2;
            
            if(arr[mid] == tar)
                return mid;
            else if(arr[mid] > tar)
                return helper(arr, tar, st, mid - 1);
            else
                return helper(arr, tar, mid+1, end);
        
    }
    
}