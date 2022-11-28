class Solution {
    public void moveZeroes(int[] nums) {
        int[] res = new int[nums.length];
        
        int count = 0;
        for(int val : nums){
            if(val == 0)
                count++;
        }
        
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                res[index++] = nums[i];
            }
        }
        
        for(int i = 0; i < nums.length; i++){
            nums[i] = res[i];
        }
    }
}