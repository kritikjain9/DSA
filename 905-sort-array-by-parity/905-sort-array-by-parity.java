class Solution {
      
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length == 1){
            return new int[]{nums[0]};
        }
        
        int zeros = 0, ones = nums.length - 1;
        while(zeros < ones){
            if(nums[zeros] % 2 == 0){
                zeros++;
            }else{
                int temp = nums[zeros];
                nums[zeros] = nums[ones];
                nums[ones] = temp;
                ones--;
            }
        }
        return nums;
    }
}