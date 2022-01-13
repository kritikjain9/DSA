class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length == 2){
            if(nums[0] + nums[1] == target)
                return new int[]{0, 1};
        }
        int[] res = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(i == j)
                    continue;
                
                if(nums[i] + nums[j] == target)
                    return new int[] {i, j};
                
            }
        }
        return new int[]{-1, -1};
    }
}