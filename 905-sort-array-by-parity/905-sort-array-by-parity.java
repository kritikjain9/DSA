class Solution {
      
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length == 1){
            return new int[]{nums[0]};
        }
        
        int i = 0, j = 0;
        while(i < nums.length){
            if(nums[i] % 2 == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++; j++;
            }else{
                i++;
            }
        }
        return nums;
    }
}