class Solution {
    // public void reverseString(char[] s) {
    //     int st = 0, end = s.length - 1;
    //     while(st <= end){
    //         char temp = s[st];
    //         s[st] = s[end];
    //         s[end] = temp;
    //         st++; end--;
    //     }
    // }
    
    public void reverseString(char[] s) {
        helper(s, 0, s.length - 1);
    }
    
    public void helper(char[] s, int st, int end){
        if(st > end)
            return;
        
        char temp = s[st];
        s[st] = s[end];
        s[end] = temp;
        
        helper(s, st += 1, end -= 1);
    }
    
}