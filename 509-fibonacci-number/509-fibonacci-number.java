class Solution {
    public int fib(int n) {
        if(n < 1)
            return n;
        
        return (int)((Math.pow((1 + Math.sqrt(5)) / 2, n) - Math.pow((1 - Math.sqrt(5)) / 2, n)) / Math.sqrt(5));
    }
}