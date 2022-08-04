class Solution {
    public int findMin(int[] nums) {
        int res = Integer.MAX_VALUE;
        for(int num : nums){
            if(num < res){
                res = num;
            }
        }
        return res;
    }
}