class Solution {
    public int removeDuplicates(int[] nums) {
        int[] res = new int[nums.length];
        int i = 0, j = 1;
        
        int index = 0;
        
        while(j < nums.length){
            //i and j same
            if(nums[i] == nums[j]){
                i++; j++;
            }else{
                res[index++] = nums[i];
                i++; j++;
            }
        }
        
        res[index++] = nums[j - 1];
        System.out.println(Arrays.toString(res));
        
        Arrays.fill(nums, 0);
        for(int k = 0; k < nums.length; k++){
            nums[k] = res[k];
        }
        
        
        return index;
    }
}