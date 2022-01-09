class Solution {
    public int thirdMax(int[] nums) {
        Long fMax = Long.MIN_VALUE;
        Long sMax = Long.MIN_VALUE;
        Long tMax = Long.MIN_VALUE;
        
        for(int num : nums){
            if(num > fMax){
                fMax = (long)num;
            }
        }
        
        for(int num : nums){
            if(num != fMax){
                if(num > sMax)
                    sMax = (long)num;
            }
        }
        
        for(int num : nums){
            if(num != fMax && num != sMax){
                if(num > tMax)
                    tMax = (long)num;
            }
        }
        
        if(tMax == Long.MIN_VALUE){
            return fMax.intValue();
        }
        return tMax.intValue();
    }
}