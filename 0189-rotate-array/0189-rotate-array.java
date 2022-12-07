class Solution {
    public void rotate(int[] nums, int k) {
        int[] res = new int[nums.length];
        k = k % nums.length;
        
        int startIndex = nums.length - k;
        
        for(int i = 0; i < nums.length; i++){
            res[i] = nums[(startIndex++) % nums.length];
        }
        
        // System.out.println(Arrays.toString(res));
        for(int i = 0; i < nums.length; i++){
            nums[i] = res[i];
        }
    }
}