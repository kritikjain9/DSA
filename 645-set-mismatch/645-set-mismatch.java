class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        
        res[0] = findDuplicateNumber(nums);
        res[1] = missingNumber(nums);
        
        return res;
    }
    
    public int findDuplicateNumber(int[] nums) {
        int idx = 0;
        
        while(idx < nums.length){
            int correctIdx = nums[idx] - 1;
            
            if(nums[idx] != idx+1){
                if(nums[idx] == nums[correctIdx]){
                    return nums[idx];
                }else{
                    int temp = nums[idx];
                    nums[idx] = nums[correctIdx];
                    nums[correctIdx] = temp;
                }
            }else{
                idx++;
            }
            
        }
        return -1;
    }
    
    public int missingNumber(int[] nums) {
        int idx = 0;

        while(idx < nums.length){
            if(nums[idx] == nums.length){
                idx++;
                continue;
            }
            
            int correctIdx = nums[idx] - 1;
            if(nums[idx] == nums[correctIdx]){
                idx++;
            }
            else{
                int temp = nums[idx];
                nums[idx] = nums[correctIdx];
                nums[correctIdx] = temp;
            } 
        }
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i+1){
                return i+1;
            }
        }
        return nums.length;
    }
    
}