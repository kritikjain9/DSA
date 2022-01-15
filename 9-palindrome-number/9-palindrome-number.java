class Solution {
    public boolean isPalindrome(int num) {
        if(num < 0 || (num != 0 && num % 10 == 0))
            return false;
        
        //checking half the number, so that we dont have to deal with integer overflow
        
        int rev = 0;
        while(num > rev){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return (num == rev || num == rev/10);
    }
}