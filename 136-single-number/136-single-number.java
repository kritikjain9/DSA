class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        
        HashSet <Integer> set = new HashSet <>();
        for(int num : nums){
            if(set.contains(num)){
                set.remove(num);
            }else{
                set.add(num);
            }
        }
        
        for(int element : set)
            return element;
        
        return nums[0];
    }
}