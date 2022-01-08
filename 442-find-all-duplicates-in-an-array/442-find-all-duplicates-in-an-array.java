class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int idx = 0;
        while(idx < nums.length){
            int corrIdx = nums[idx] - 1;
            
            if(nums[idx] == nums[corrIdx]){
                idx++;
            }else{
                int temp = nums[idx];
                nums[idx] = nums[corrIdx];
                nums[corrIdx] = temp;
            }
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != (i+1)){
                res.add(nums[i]);
            }
        }
        return res;
    }
}