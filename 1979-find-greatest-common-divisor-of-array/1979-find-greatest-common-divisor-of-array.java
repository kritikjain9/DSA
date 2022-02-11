class Solution {
    
     int gcd(int a, int b) {
        
        // if b=0, a is the GCD
        if (b == 0)
            return a;
        
        // call the gcd() method recursively by
        // replacing a with b and b with
        // modulus(a,b) as long as b != 0
        else
            return gcd(b, a % b);
    }
    
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int num : nums){
            if(num >= max)
                max = num;
        
            if(num < min)
                min = num;   
        }
        
        int a = max, b = min;
        
        return gcd(a, b);
    }
}