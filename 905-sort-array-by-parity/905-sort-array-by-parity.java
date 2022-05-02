class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int [] arr = new int[nums.length];
        int even = 0, odd = nums.length - 1;
        
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(num % 2 == 0){
                arr[even++] = num;
            }else{
                arr[odd--] = num;
            }
        }
        return arr;
    }
}