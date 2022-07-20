class Solution {
    public int minMoves2(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        
        Arrays.sort(nums);
        // int median = nums[nums.length / 2];
        int res = 0;
        int i = 0, j = nums.length - 1;
        while(i < j){
            res += nums[j] - nums[i];
            i++; j--;
        }
        
        return res;
    }
}