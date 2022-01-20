class Solution {
        
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            hm.put(nums[i], i);
        }
        
         int[] res = new int[2];
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(hm.containsKey(complement) && i != hm.get(complement)){
                res[0] = i;
                res[1] = hm.get(complement);
                // return res;
            }
        }
        
           return res; 
    }
}