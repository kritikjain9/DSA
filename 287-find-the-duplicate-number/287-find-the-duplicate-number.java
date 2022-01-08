class Solution {
    public int findDuplicate(int[] nums) {
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
}