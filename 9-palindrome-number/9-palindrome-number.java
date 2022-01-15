class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        
        int count = (int)Math.floor(Math.log10(x) + 1);
        
        int rev = 0, temp = x, pow = (int)Math.pow(10, count-1);
        while(temp > 0){
            int dig = temp % 10;
            dig *= pow;
            rev += dig;
            
            pow /= 10;
            temp /= 10;
        }
        System.out.println(rev);
        System.out.println(x);
        return rev == x;
        
    }
}