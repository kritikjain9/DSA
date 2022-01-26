class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n != 1 && n % 2 != 0)
            return false;
        
        Double d = Double.valueOf(n);
        
        while(d > 1.0){
            d = d / 2;
        }
        
        if(d == 1.0 || d == -1.0)
            return true;
        else
            return false;
        
    }
}