class Solution {
    public String firstPalindrome(String[] words) {
        for(String word : words){
            if(isPalin(word))
                return word;
        }
        return "";
    }
    
    public boolean isPalin(String str){
        int st = 0, end = str.length() - 1;
        while(st < end){
            if(str.charAt(st) == str.charAt(end)){
                st++; end--;
            }else
                return false;
        }
        return true;
    }
    
}