class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(i == j)
                    continue;
                
                if(nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }
    
//     public int[] twoSum(int[] nums, int target) {
//         HashMap<Integer, Integer> hm = new HashMap<>();
        
//         for(int i = 0, i < nums.length; i++){
//             hm.put(i, nums[i]);
//         }
        
//         int[] res = new int[2];
//         for(Map.Entry map : hm.entrySet()){
//             //regerring to our current index
//             int idx = map.getKey();
//             if(hm.containsKey(target - arr[idx]))
                
//         }
        
//     }
}