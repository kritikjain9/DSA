class Solution {
    
    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b]; 
        arr[b] = temp;
    }
    
    public int[] sortArrayByParityII(int[] nums) {
        int even = 0, odd = 1;
        
        while(even < nums.length && odd < nums.length){
            if(nums[even] % 2 == 0)
                even += 2;
            else{
                swap(nums, even, odd);
                odd += 2;
            }
        }
        return nums;
    }
}