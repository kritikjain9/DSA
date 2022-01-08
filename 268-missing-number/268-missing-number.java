class Solution {
    public int missingNumber(int[] nums) {
        int idx = 0;

        while(idx < nums.length){
            if(nums[idx] == nums.length){
                idx++;
                continue;
            }
            
            int correctIdx = nums[idx];
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
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }
}