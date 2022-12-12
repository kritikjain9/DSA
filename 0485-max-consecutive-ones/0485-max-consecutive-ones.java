class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int maxOnes = Integer.MIN_VALUE;
        int i = 0, j = 0;
        
        while(j < nums.length){
            if(nums[j] == 1){
                j++;
            }else{
                maxOnes = Math.max(maxOnes, (j - i));
                i = j;
                i++;
                j++;
            }
        }
        
        if(j == nums.length){
            maxOnes = Math.max(maxOnes, j - i);
        }
        
        return maxOnes;
    }
}