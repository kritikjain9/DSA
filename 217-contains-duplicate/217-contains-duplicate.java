class Solution {
    
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i+1])
                return true;
        }
        return false;
    }
    
    // public boolean containsDuplicate(int[] nums) {
    //     int i = 0, j = nums.length - 1;
    //     while(i < j){
    //         if(nums[i] == nums[j]){
    //             return true;
    //         }else{
    //             i++;
    //         }
    //     }
    //     return false;
    // }
}