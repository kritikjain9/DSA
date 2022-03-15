class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum = 0;
        int res = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(sum, 1);
        
        for(int val : nums){
            sum += val;
            
            int modVal = sum % k;
            if(modVal < 0){
                modVal += k;
            }
            
            if(map.containsKey(modVal)){
                res += map.get(modVal);
                map.put(modVal, map.get(modVal) + 1);
            }else{
                map.put(modVal, 1);
            }
        }
        return res;
    }
}