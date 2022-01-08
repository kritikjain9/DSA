class Solution {
    public int missingNumber(int[] nums) {
        int idx = 0;
        
        while(idx < nums.length){
            if(nums[idx] == 0){
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
        
        int zeroIdx = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zeroIdx = i;
            }
        }
        if(zeroIdx == -1){
            return 0;
        }else{
            return zeroIdx + 1;
        }
    }
}