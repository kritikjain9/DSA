class Solution {
    public int majorityElement(int[] nums) {
        int freq = nums.length / 2;
        int majEle = -1;
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num : nums){
            if(hm.containsKey(num)){
                hm.put(num, hm.get(num) + 1);
            }else{
                hm.put(num, 1);
            }
            
            if(hm.get(num) > freq){
                freq = hm.get(num);
                majEle = num;
            }
            
        }
        return majEle;
    }
}