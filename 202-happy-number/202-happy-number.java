class Solution {
    
    public int findSquare(int n){
        int sum = 0;
        while(n != 0){
            int dig = n % 10;
            sum += dig * dig;
            n /= 10;
        }
        return sum;
    }
    
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        
        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }
        while(fast != slow);
        
        if(slow == 1)return true;
        return false;
    }
}