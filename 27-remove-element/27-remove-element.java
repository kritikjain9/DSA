class Solution {
    public int removeElement(int[] nums, int val) {
        int st = 0, end = nums.length - 1;
        while(st < end){
            if(nums[st] != val)
                st++;
            else{
                int temp = nums[st];
                nums[st] = nums[end];
                nums[end] = temp;
                end--;
            }
        }
        
        int i = 0;
        for(; i < nums.length; i++){
            if(nums[i] == val)
                break;
        }
        return (i);
    }
}