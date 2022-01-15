class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        
        String str = String.valueOf(x);
        System.out.println(str);
        String rev = "";
        
        for(int i = str.length() - 1; i >= 0; i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);
        return str.equals(rev);
    }
}